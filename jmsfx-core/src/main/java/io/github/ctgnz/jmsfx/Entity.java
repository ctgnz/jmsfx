package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public interface Entity extends MainElement {

    @Override
    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    @Override
    default Entity getEntity() {
        return this;
    }

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s0000", getBaseSymbolSet().getId(), getId());
    }

    @Override
    default String getGraphicLocation(StandardIdentity identity) {
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

    default List<EntityType> getEntityTypes() {
        return Collections.emptyList();
    }

}
