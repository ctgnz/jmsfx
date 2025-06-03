package io.github.ctgnz.jmsfx.icon.dto;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.Context;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.HqtfDummy;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.StandardIdentity;
import io.github.ctgnz.jmsfx.icon.Status;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.Version;

public class LibraryDto {
    private final List<VersionDto> version;
    private final List<ContextDto> context;
    private final List<StandardIdentityDto> standardIdentity;
    private final List<DimensionDto> dimension;
    private final List<StatusDto> status;
    private final List<HqtfDummyDto> hqtfDummy;
    private final List<AmplifierDto> amplifiers;
    private final List<ListAmplifierDto> listAmplifiers;
    private final Map<SymbolSet, SymbolSetDto> symbolSets;

    public LibraryDto() {
        this.version = Lists.transform(Lists.newArrayList(Version.values()), VersionDto::new);
        this.context = Lists.transform(Lists.newArrayList(Context.values()), ContextDto::new);
        this.standardIdentity = Lists.transform(Lists.newArrayList(StandardIdentity.values()), StandardIdentityDto::new);
        this.dimension = Lists.transform(Lists.newArrayList(Dimension.values()), DimensionDto::new);
        this.status = Lists.transform(Lists.newArrayList(Status.values()), StatusDto::new);
        this.hqtfDummy = Lists.transform(Lists.newArrayList(HqtfDummy.values()), HqtfDummyDto::new);
        this.amplifiers = Lists.transform(Lists.newArrayList(Amplifier.values()), AmplifierDto::new);
        this.listAmplifiers = Lists.transform(Lists.newArrayList(ListAmplifierType.values()), ListAmplifierDto::new);
        this.symbolSets = Maps.uniqueIndex(dimension.stream().flatMap(DimensionDto::streamSymbolSets).toList(), SymbolSetDto::getSymbolSet);
    }

    public List<AmplifierDto> getAmplifiers() {
        return amplifiers;
    }

    public List<ContextDto> getContext() {
        return context;
    }

    public List<DimensionDto> getDimension() {
        return dimension;
    }

    public List<HqtfDummyDto> getHqtfDummy() {
        return hqtfDummy;
    }

    public List<ListAmplifierDto> getListAmplifiers() {
        return listAmplifiers;
    }

    public List<StandardIdentityDto> getStandardIdentity() {
        return standardIdentity;
    }

    public List<StatusDto> getStatus() {
        return status;
    }

    public SymbolSetDto getSymbolSet(SymbolSet symbolSet) {
        return symbolSets.computeIfAbsent(symbolSet, SymbolSetDto::new);
    }

    public Map<SymbolSet, SymbolSetDto> getSymbolSets() {
        return symbolSets;
    }

    public List<VersionDto> getVersion() {
        return version;
    }

}
