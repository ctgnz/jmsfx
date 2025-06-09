package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public interface IEntity extends IMainElement {

    @Override
    default ISymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    @Override
    default IEntity getEntity() {
        return this;
    }

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s0000", getBaseSymbolSet().getId(), getId());
    }

    @Override
    default String getGraphicLocation(IStandardIdentity identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (StringUtils.isBlank(graphicLocation)) {
            return "/svg/Appendices/98100000.svg";
        }
        String graphicIdentifier = getGraphicIdentifier();
        if (isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, graphicIdentifier, identity.getGroup().getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, graphicIdentifier);
        }
    }

    default List<IEntityType> getEntityTypes() {
        return Collections.emptyList();
    }

}
