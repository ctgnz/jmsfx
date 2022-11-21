package nz.co.ctg.jmsfx.icon.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.batik.util.XMLResourceDescriptor;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.io.DOMReader;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGCircleElement;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGElement;
import org.w3c.dom.svg.SVGEllipseElement;
import org.w3c.dom.svg.SVGGElement;
import org.w3c.dom.svg.SVGImageElement;
import org.w3c.dom.svg.SVGLineElement;
import org.w3c.dom.svg.SVGPathElement;
import org.w3c.dom.svg.SVGPolygonElement;
import org.w3c.dom.svg.SVGPolylineElement;
import org.w3c.dom.svg.SVGRectElement;
import org.w3c.dom.svg.SVGSVGElement;
import org.w3c.dom.svg.SVGTSpanElement;
import org.w3c.dom.svg.SVGTextElement;

import com.google.common.collect.Maps;

import nz.co.ctg.jmsfx.icon.svg.SvgCircle;
import nz.co.ctg.jmsfx.icon.svg.SvgEllipse;
import nz.co.ctg.jmsfx.icon.svg.SvgGraphic;
import nz.co.ctg.jmsfx.icon.svg.SvgGroup;
import nz.co.ctg.jmsfx.icon.svg.SvgImage;
import nz.co.ctg.jmsfx.icon.svg.SvgLine;
import nz.co.ctg.jmsfx.icon.svg.SvgPath;
import nz.co.ctg.jmsfx.icon.svg.SvgPolygon;
import nz.co.ctg.jmsfx.icon.svg.SvgPolyline;
import nz.co.ctg.jmsfx.icon.svg.SvgRectangle;
import nz.co.ctg.jmsfx.icon.svg.SvgShape;
import nz.co.ctg.jmsfx.icon.svg.SvgText;

import static org.apache.batik.anim.dom.SVGDOMImplementation.SVG_NAMESPACE_URI;

import javafx.scene.paint.Color;
import javafx.scene.shape.FillRule;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;

public class SvgParser {
    private static final Map<String, SvgGraphic> CACHE = Collections.synchronizedMap(Maps.newHashMap());

    public static void cacheItem(String key, SvgGraphic graphic) {
        CACHE.put(key, graphic);
    }

    public static void clearCache() {
        CACHE.clear();
    }

    private final FXTransformListHandler transformHandler = new FXTransformListHandler();
    private final FXPointsHandler pointsHandler = new FXPointsHandler();
    private final FXNumberHandler numberHandler = new FXNumberHandler();
    private final FXFontHandler fontHandler = new FXFontHandler();

    private final FXStrokeHandler strokeHandler = new FXStrokeHandler();

    public SvgParser() {
    }

    public SvgGraphic parseFile(File selectedFile) {
        return CACHE.computeIfAbsent(selectedFile.getAbsolutePath(), key -> {
            try (InputStream in = Files.newInputStream(selectedFile.toPath())) {
                return doParse(key, in);
            } catch (Exception e) {
                return new SvgGraphic();
            }
        });
    }

    public SvgGraphic parseFile(String filePath) {
        return CACHE.computeIfAbsent(filePath, key -> {
            try (InputStream in = SvgParser.class.getResourceAsStream(filePath)) {
                return doParse(key, in);
            } catch (Exception e) {
                return new SvgGraphic();
            }
        });
    }

    public void writeFile(Path directoryPath, String fileName, SvgGraphic graphic) {
        try (BufferedWriter writer = Files.newBufferedWriter(directoryPath.resolve(fileName), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            // Get a DOMImplementation.
            DOMImplementation domImpl = SVGDOMImplementation.getDOMImplementation();

            // Create an instance of org.w3c.dom.Document.
            Document document = domImpl.createDocument(SVG_NAMESPACE_URI, "svg", null);

            // Create an instance of the SVG Generator.
            Element svgRoot = document.getDocumentElement();
            doWrite(svgRoot, graphic, document);

            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setIndentSize(4);
            format.setIndent(true);
            format.setExpandEmptyElements(false);
            format.setNewLineAfterDeclaration(false);
            XMLWriter xmlWriter = new XMLWriter(writer, format);
            xmlWriter.write(new DOMReader().read(document));
        } catch (FileNotFoundException e) {
            System.out.println("Ignore this");
        } catch (Exception e) {
            System.out.format("Exception writing %s [%s]%n", fileName, e.getMessage());
        }
    }

    public String writeGraphic(SvgGraphic graphic) {
        try (StringWriter writer = new StringWriter()) {
                        // Get a DOMImplementation.
            DOMImplementation domImpl = SVGDOMImplementation.getDOMImplementation();

            // Create an instance of org.w3c.dom.Document.
            Document document = domImpl.createDocument(SVG_NAMESPACE_URI, "svg", null);

            // Create an instance of the SVG Generator.
            Element svgRoot = document.getDocumentElement();
            doWrite(svgRoot, graphic, document);

            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setIndentSize(4);
            format.setIndent(true);
            format.setExpandEmptyElements(false);
            format.setNewLineAfterDeclaration(false);
            XMLWriter xmlWriter = new XMLWriter(writer, format);
            xmlWriter.write(new DOMReader().read(document));
            return writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void parseGroup(SVGGElement groupItem, SvgGroup shapes) {
        if (isDisplayGroup(groupItem)) {
            if (groupItem.hasAttribute("transform")) {
                String text = groupItem.getAttribute("transform");
                shapes.getTransforms().addAll(transformHandler.parse(text));
            }
            NodeList elements = groupItem.getChildNodes();
            IntStream.range(0, elements.getLength()).forEach(i -> {
                if (elements.item(i) instanceof SVGElement) {
                    parseShapeElement((SVGElement) elements.item(i), shapes);
                }
            });
        }
    }

    protected void parseShapeElement(SVGElement element, SvgGroup shapes) {
        if (isDisplayGroup(element)) {
            if (element.hasAttribute("style")) {
                parseStyle(element);
            }
            if (element instanceof SVGCircleElement) {
                parseCircle((SVGCircleElement) element, shapes);
            } else if (element instanceof SVGEllipseElement) {
                parseEllipse((SVGEllipseElement) element, shapes);
            } else if (element instanceof SVGLineElement) {
                parseLine((SVGLineElement) element, shapes);
            } else if (element instanceof SVGPathElement) {
                parsePath((SVGPathElement) element, shapes);
            } else if (element instanceof SVGPolygonElement) {
                parsePolygon((SVGPolygonElement) element, shapes);
            } else if (element instanceof SVGPolylineElement) {
                parsePolyline((SVGPolylineElement) element, shapes);
            } else if (element instanceof SVGRectElement) {
                parseRectangle((SVGRectElement) element, shapes);
            } else if (element instanceof SVGImageElement) {
                parseImage((SVGImageElement) element, shapes);
            } else if (element instanceof SVGTextElement) {
                if (element.getFirstChild() instanceof SVGTSpanElement) {
                    SVGTSpanElement tspan = (SVGTSpanElement) element.getFirstChild();
                    if (tspan.hasAttribute("style")) {
                        parseStyle(tspan);
                        parseText(tspan, shapes);
                    } else {
                        parseText((SVGTextElement) element, shapes);
                    }
                } else {
                    parseText((SVGTextElement) element, shapes);
                }
            } else if (element instanceof SVGGElement) {
                SvgGroup childGroup = new SvgGroup();
                shapes.getChildren().add(childGroup);
                parseGroup((SVGGElement) element, childGroup);
            }
        }
    }

    protected void writeGroup(SvgGroup group, Element parent, Document document) {
        Element grpElement = document.createElementNS(SVG_NAMESPACE_URI, "g");
        parent.appendChild(grpElement);
        writeTransforms(grpElement, group.getTransforms());
        group.getElements().forEach(shape -> writeShape(shape, grpElement, document));
        group.getChildren().forEach(child -> writeGroup(child, grpElement, document));
    }

    protected void writeShape(SvgShape shape, Element parent, Document document) {
        if (shape instanceof SvgCircle) {
            writeCircle((SvgCircle) shape, parent, document);
        } else if (shape instanceof SvgEllipse) {
            writeEllipse((SvgEllipse) shape, parent, document);
        } else if (shape instanceof SvgLine) {
            writeLine((SvgLine) shape, parent, document);
        } else if (shape instanceof SvgPath) {
            writePath((SvgPath) shape, parent, document);
        } else if (shape instanceof SvgPolygon) {
            writePolygon((SvgPolygon) shape, parent, document);
        } else if (shape instanceof SvgPolyline) {
            writePolyline((SvgPolyline) shape, parent, document);
        } else if (shape instanceof SvgRectangle) {
            writeRectangle((SvgRectangle) shape, parent, document);
//        } else if (shape instanceof SvgImage) {
//            writeImage((SvgImage) shape, parent, document);
        } else if (shape instanceof SvgText) {
            writeText((SvgText) shape, parent, document);
        }
    }

    private SvgGraphic doParse(String filePath, InputStream inputStream) {
        SvgGraphic shapes = new SvgGraphic();
        try {
            String parser = XMLResourceDescriptor.getXMLParserClassName();
            SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
            Document doc = f.createDocument(filePath, inputStream);
            SVGSVGElement svgElement = ((SVGDocument) doc).getRootElement();
            shapes.setWidth(svgElement.getWidth().getAnimVal().getValue());
            shapes.setHeight(svgElement.getHeight().getAnimVal().getValue());
            NodeList elements = svgElement.getChildNodes();
            SvgGroup baseGroup = shapes.getBaseGroup();
            IntStream.range(0, elements.getLength()).forEach(i -> {
                Node element = elements.item(i);
                if (element instanceof SVGGElement && isDisplayGroup((SVGElement) element)) {
                    SvgGroup childGroup = new SvgGroup();
                    baseGroup.getChildren().add(childGroup);
                    parseGroup((SVGGElement) element, childGroup);
                } else if (element instanceof SVGElement) {
                    parseShapeElement((SVGElement) element, baseGroup);
                }
            });
            return shapes;
        } catch (Exception e) {
            System.out.format("Exception processing %s [%s]%n", filePath, e.getMessage());
            return shapes;
        }
    }

    private void doWrite(Element svgRoot, SvgGraphic graphic, Document document) {
        svgRoot.setAttributeNS(null, "width", String.format("%.0f", graphic.getWidth()));
        svgRoot.setAttributeNS(null, "height", String.format("%.0f", graphic.getHeight()));
        svgRoot.setAttributeNS(null, "viewBox", String.format("%.0f %.0f %.0f %.0f", graphic.getX(), graphic.getY(), graphic.getWidth(), graphic.getHeight()));
        if (StringUtils.isNotBlank(graphic.getTitle())) {
            Element grpElement = document.createElementNS(SVG_NAMESPACE_URI, "title");
            grpElement.setTextContent(graphic.getTitle());
            svgRoot.appendChild(grpElement);
        }
        writeGroup(graphic.getBaseGroup(), svgRoot, document);
    }

    private boolean isDisplayGroup(SVGElement item) {
        if (item.hasAttribute("display")) {
            return !"none".equalsIgnoreCase(item.getAttribute("display"));
        }
        return true;
    }

    private void parseCircle(SVGCircleElement item, SvgGroup shapes) {
        double cx = item.getCx().getAnimVal().getValue();
        double cy = item.getCy().getAnimVal().getValue();
        double r = item.getR().getAnimVal().getValue();
        SvgCircle circle = new SvgCircle(cx, cy, r);
        setColors(item, circle);
        setStrokeProperties(item, circle);
        setTransforms(item, circle);
        shapes.getElements().add(circle);
    }

    private void parseEllipse(SVGEllipseElement item, SvgGroup shapes) {
        double cx = item.getCx().getAnimVal().getValue();
        double cy = item.getCy().getAnimVal().getValue();
        double rx = item.getRx().getAnimVal().getValue();
        double ry = item.getRy().getAnimVal().getValue();
        SvgEllipse ellipse = new SvgEllipse(cx, cy, rx, ry);
        setColors(item, ellipse);
        setStrokeProperties(item, ellipse);
        setTransforms(item, ellipse);
        shapes.getElements().add(ellipse);
    }

    private void parseImage(SVGImageElement item, SvgGroup shapes) {
        String imageData = item.getHref().getAnimVal();
        double x = item.getX().getAnimVal().getValue();
        double y = item.getY().getAnimVal().getValue();
        double width = item.getWidth().getAnimVal().getValue();
        double height = item.getHeight().getAnimVal().getValue();
        SvgImage svgImage = new SvgImage(x, y, width, height, imageData.replaceAll("\\s", "").substring(imageData.indexOf(',') + 1));
        shapes.addImage(svgImage);
    }

    private void parseLine(SVGLineElement item, SvgGroup shapes) {
        double x1 = item.getX1().getAnimVal().getValue();
        double y1 = item.getY1().getAnimVal().getValue();
        double x2 = item.getX2().getAnimVal().getValue();
        double y2 = item.getY2().getAnimVal().getValue();
        SvgLine line = new SvgLine(x1, y1, x2, y2);
        setColors(item, line);
        setStrokeProperties(item, line);
        setTransforms(item, line);
        shapes.getElements().add(line);
    }

    private void parsePath(SVGPathElement item, SvgGroup shapes) {
        SvgPath path = new SvgPath(item.getAttribute("d"));
        setColors(item, path);
        setStrokeProperties(item, path);
        setTransforms(item, path);
        shapes.getElements().add(path);
    }

    private void parsePolygon(SVGPolygonElement item, SvgGroup shapes) {
        SvgPolygon polygon = new SvgPolygon(pointsHandler.parse(item.getAttribute("points")));
        setColors(item, polygon);
        setStrokeProperties(item, polygon);
        setTransforms(item, polygon);
        shapes.getElements().add(polygon);
    }

    private void parsePolyline(SVGPolylineElement item, SvgGroup shapes) {
        SvgPolyline polyline = new SvgPolyline(pointsHandler.parse(item.getAttribute("points")));
        setColors(item, polyline);
        setStrokeProperties(item, polyline);
        setTransforms(item, polyline);
        shapes.getElements().add(polyline);
    }

    private void parseRectangle(SVGRectElement item, SvgGroup shapes) {
        double x = item.getX().getAnimVal().getValue();
        double y = item.getY().getAnimVal().getValue();
        double width = item.getWidth().getAnimVal().getValue();
        double height = item.getHeight().getAnimVal().getValue();
        SvgRectangle rect = new SvgRectangle(x, y, width, height);
        setColors(item, rect);
        setStrokeProperties(item, rect);
        setTransforms(item, rect);
        shapes.getElements().add(rect);
    }

    private void parseStyle(SVGElement element) {
        String[] attrs = element.getAttribute("style").split(";");
        Arrays.stream(attrs).forEach(attr -> {
            String[] attrParts = attr.split(":");
            if (!attrParts[0].startsWith("-inkscape")) {
                element.setAttribute(attrParts[0], attrParts[1]);
            }
        });
    }

    private void parseText(SVGTextElement item, SvgGroup shapes) {
        String content = item.getTextContent();
        SvgText text = new SvgText(content);
        setFont(item, text);
        setColors(item, text);
        if (item.hasAttribute("transform")) {
            setTransforms(item, text);
        } else {
            double x = item.getX().getAnimVal().getItem(0).getValue();
            double y = item.getY().getAnimVal().getItem(0).getValue();
            text.getTransforms().add(new Translate(x, y));
        }
        shapes.getElements().add(text);
    }

    private void parseText(SVGTSpanElement item, SvgGroup shapes) {
        String content = item.getTextContent();
        SvgText text = new SvgText(content);
        setFont(item, text);
        setColors(item, text);
        if (item.hasAttribute("transform")) {
            setTransforms(item, text);
        } else {
            double x = item.getX().getAnimVal().getItem(0).getValue();
            double y = item.getY().getAnimVal().getItem(0).getValue();
            text.getTransforms().add(new Translate(x, y));
        }
        shapes.getElements().add(text);
    }

    private void setColors(SVGElement item, SvgShape shape) {
        shape.setFill(FXColorHandler.parseColor(item.getAttribute("fill")));
        shape.setStroke(FXColorHandler.parseColor(item.getAttribute("stroke")));
        if (item.hasAttribute("fill-rule")) {
            shape.setFillRule("evenodd".equals(item.getAttribute("fill-rule")) ? FillRule.EVEN_ODD : FillRule.NON_ZERO);
        }
    }

    private void setFont(SVGElement item, SvgText text) {
        String family = fontHandler.parseFontFamily(item.getAttribute("font-family"));
        double size = fontHandler.parseFontSize(item.getAttribute("font-size"), 72);
        FontWeight weight = fontHandler.parseFontWeight(item.getAttribute("font-weight"));
        FontPosture posture = fontHandler.parseFontPosture(item.getAttribute("font-style"));
        text.setFont(Font.font(family, weight, posture, size));
    }

    private void setStrokeProperties(SVGElement item, SvgShape shape) {
        shape.setStrokeWidth(numberHandler.parseDouble(item.getAttribute("stroke-width"), 0));
        if (item.hasAttribute("stroke-miterlimit")) {
            shape.setStrokeMiterLimit(numberHandler.parseDouble(item.getAttribute("stroke-miterlimit"), 4));
        }
        shape.setStrokeLineCap(strokeHandler.parseLineCap(item.getAttribute("stroke-linecap")));
        shape.setStrokeLineJoin(strokeHandler.parseLineJoin(item.getAttribute("stroke-linejoin")));
        if (item.hasAttribute("stroke-dashoffset")) {
            shape.setStrokeDashOffset(numberHandler.parseDouble(item.getAttribute("stroke-dashoffset"), 0));
        }
        if (item.hasAttribute("stroke-dasharray")) {
            shape.getStrokeDashArray().addAll(numberHandler.parse(item.getAttribute("stroke-dasharray")));
        }
    }

    private void setTransforms(SVGElement item, SvgShape shape) {
        if (item.hasAttribute("transform")) {
            String text = item.getAttribute("transform");
            shape.getTransforms().addAll(transformHandler.parse(text));
        }
    }

    private void writeCircle(SvgCircle circle, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "circle");
        element.setAttributeNS(null, "r", writeNumber(circle.getR()));
        element.setAttributeNS(null, "cx", writeNumber(circle.getCx()));
        element.setAttributeNS(null, "cy", writeNumber(circle.getCy()));
        writeShapeProperties(circle, element);
        writeTransforms(element, circle.getTransforms());
        parent.appendChild(element);
    }

    private void writeColor(Element element, String attribute, Color color) {
        if (color != null) {
            if (color == Color.TRANSPARENT) {
                element.setAttributeNS(null, attribute, "none");
            } else {
                String rgb = String.format("#%02X%02X%02X", (int) (color.getRed() * 255), (int) (color.getGreen() * 255), (int) (color.getBlue() * 255));
                element.setAttributeNS(null, attribute, rgb);
            }
        }
    }

    private void writeEllipse(SvgEllipse ellipse, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "ellipse");
        element.setAttributeNS(null, "cx", writeNumber(ellipse.getCx()));
        element.setAttributeNS(null, "cy", writeNumber(ellipse.getCy()));
        element.setAttributeNS(null, "rx", writeNumber(ellipse.getRx()));
        element.setAttributeNS(null, "ry", writeNumber(ellipse.getRy()));
        writeShapeProperties(ellipse, element);
        writeTransforms(element, ellipse.getTransforms());
        parent.appendChild(element);
    }

    private void writeLine(SvgLine line, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "line");
        element.setAttributeNS(null, "x1", writeNumber(line.getX1()));
        element.setAttributeNS(null, "y1", writeNumber(line.getY1()));
        element.setAttributeNS(null, "x2", writeNumber(line.getX2()));
        element.setAttributeNS(null, "y2", writeNumber(line.getY2()));
        writeShapeProperties(line, element);
        writeTransforms(element, line.getTransforms());
        parent.appendChild(element);
    }

    private String writeNumber(double value) {
        return String.format("%10.8f", value);
    }

    private void writePath(SvgPath path, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "path");
        element.setAttributeNS(null, "d", path.getSvgPath());
        writeShapeProperties(path, element);
        writeTransforms(element, path.getTransforms());
        parent.appendChild(element);
    }

    private void writePolygon(SvgPolygon polygon, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "polygon");
        writePointsList(element, polygon.getPoints());
        writeShapeProperties(polygon, element);
        writeTransforms(element, polygon.getTransforms());
        parent.appendChild(element);
    }

    private void writePointsList(Element element, List<Double> points) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < points.size() - 1; i += 2) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(writeNumber(points.get(i)));
            sb.append(",");
            sb.append(writeNumber(points.get(i + 1)));
        }
        element.setAttributeNS(null, "points", sb.toString());
    }

    private void writePolyline(SvgPolyline polyline, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "polyline");
        writePointsList(element, polyline.getPoints());
        writeShapeProperties(polyline, element);
        writeTransforms(element, polyline.getTransforms());
        parent.appendChild(element);
    }

    private void writeRectangle(SvgRectangle rectangle, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "rect");
        element.setAttributeNS(null, "x", writeNumber(rectangle.getX()));
        element.setAttributeNS(null, "y", writeNumber(rectangle.getY()));
        element.setAttributeNS(null, "width", writeNumber(rectangle.getWidth()));
        element.setAttributeNS(null, "height", writeNumber(rectangle.getHeight()));
        writeShapeProperties(rectangle, element);
        parent.appendChild(element);
    }

    private void writeShapeProperties(SvgShape shape, Element element) {
        writeColor(element, "fill", (Color) shape.getFill());
        writeColor(element, "stroke", (Color) shape.getStroke());
        if (shape.getFillRule() != null) {
            element.setAttributeNS(null, "fill-rule", shape.getFillRule() == FillRule.EVEN_ODD ? "evenodd" : "nonzero");
        }
        if (shape.getStrokeWidth() > 0) {
            element.setAttributeNS(null, "stroke-width", writeNumber(shape.getStrokeWidth()));
        }
        if (shape.getStrokeLineCap() != null) {
            switch (shape.getStrokeLineCap()) {
                case ROUND:
                    element.setAttributeNS(null, "stroke-linecap", "round");
                    break;
                case SQUARE:
                    element.setAttributeNS(null, "stroke-linecap", "square");
                    break;
                default:
                    element.setAttributeNS(null, "stroke-linecap", "butt");
                    break;
            }
        }
        if (shape.getStrokeLineJoin() != null) {
            switch (shape.getStrokeLineJoin()) {
                case ROUND:
                    element.setAttributeNS(null, "stroke-linecap", "round");
                    break;
                case BEVEL:
                    element.setAttributeNS(null, "stroke-linecap", "bevel");
                    break;
                default:
                    element.setAttributeNS(null, "stroke-linecap", "miter");
                    break;
            }
        }
        if (shape.getStrokeDashOffset() > 0) {
            element.setAttributeNS(null, "stroke-dashoffset", writeNumber(shape.getStrokeDashOffset()));
        }
        if (shape.getStrokeMiterLimit() > 0 && shape.getStrokeMiterLimit() != 4) {
            element.setAttributeNS(null, "stroke-miterlimit", writeNumber(shape.getStrokeMiterLimit()));
        }
    }

    private void writeText(SvgText text, Element parent, Document document) {
        Element element = document.createElementNS(SVG_NAMESPACE_URI, "text");
        element.setTextContent(text.getContent());
        Font font = text.getFont();
        element.setAttributeNS(null, "font-family", font.getFamily());
        element.setAttributeNS(null, "font-size", writeNumber(font.getSize()));
//        text.setAttributeNS(null, "font-weight", font.getFamily());
//        text.setAttributeNS(null, "font-style", font.getFamily());
        writeTransforms(element, text.getTransforms());
        writeShapeProperties(text, element);
        parent.appendChild(element);
    }

    private void writeTransforms(Element element, List<Transform> transforms) {
        if (transforms != null && !transforms.isEmpty()) {
            element.setAttributeNS(null, "transform", transforms.stream().map(this::writeTransform).collect(Collectors.joining(" ")));
        }
    }

    private String writeTransform(Transform transform) {
        if (transform instanceof Rotate) {
            Rotate rotate = (Rotate) transform;
            return String.format("rotate(%s,%s,%s)", writeNumber(rotate.getAngle()), writeNumber(rotate.getPivotX()), writeNumber(rotate.getPivotY()));
        }
        if (transform instanceof Translate) {
            Translate translate = (Translate) transform;
            return String.format("translate(%s,%s)", writeNumber(translate.getX()), writeNumber(translate.getY()));
        }
        if (transform instanceof Scale) {
            Scale scale = (Scale) transform;
            return String.format("scale(%s,%s)", writeNumber(scale.getX()), writeNumber(scale.getY()));
        }
        if (transform instanceof Shear) {
            Shear shear = (Shear) transform;
            if (shear.getX() > 0) {
                return String.format("skewX(%s)", writeNumber(shear.getX()));
            } else {
                return String.format("skewY(%s)", writeNumber(shear.getY()));
            }
        }
        if (transform instanceof Affine) {
            Affine affine = (Affine) transform;
            return String.format("matrix(%s,%s,%s,%s,%s,%s)", writeNumber(affine.getMxx()), writeNumber(affine.getMyx()),
                writeNumber(affine.getMxy()), writeNumber(affine.getMyy()),
                writeNumber(affine.getTx()), writeNumber(affine.getTy()));
        }
        return "";
    }

}
