package io.github.ctgnz.jmsfx.icon.model;

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

public class LibraryAdapter {
    private final List<VersionAdapter> version;
    private final List<ContextAdapter> context;
    private final List<StandardIdentityAdapter> standardIdentity;
    private final List<DimensionAdapter> dimension;
    private final List<StatusAdapter> status;
    private final List<HqtfDummyAdapter> hqtfDummy;
    private final List<AmplifierAdapter> amplifiers;
    private final List<ListAmplifierAdapter> listAmplifiers;
    private final Map<SymbolSet, SymbolSetAdapter> symbolSets;

    public LibraryAdapter() {
        this.version = Lists.transform(Lists.newArrayList(Version.values()), VersionAdapter::new);
        this.context = Lists.transform(Lists.newArrayList(Context.values()), ContextAdapter::new);
        this.standardIdentity = Lists.transform(Lists.newArrayList(StandardIdentity.values()), StandardIdentityAdapter::new);
        this.dimension = Lists.transform(Lists.newArrayList(Dimension.values()), DimensionAdapter::new);
        this.status = Lists.transform(Lists.newArrayList(Status.values()), StatusAdapter::new);
        this.hqtfDummy = Lists.transform(Lists.newArrayList(HqtfDummy.values()), HqtfDummyAdapter::new);
        this.amplifiers = Lists.transform(Lists.newArrayList(Amplifier.values()), AmplifierAdapter::new);
        this.listAmplifiers = Lists.transform(Lists.newArrayList(ListAmplifierType.values()), ListAmplifierAdapter::new);
        this.symbolSets = Maps.uniqueIndex(dimension.stream().flatMap(DimensionAdapter::streamSymbolSets).toList(), SymbolSetAdapter::getSymbolSet);
    }

    public List<AmplifierAdapter> getAmplifiers() {
        return amplifiers;
    }

    public List<ContextAdapter> getContext() {
        return context;
    }

    public List<DimensionAdapter> getDimension() {
        return dimension;
    }

    public List<HqtfDummyAdapter> getHqtfDummy() {
        return hqtfDummy;
    }

    public List<ListAmplifierAdapter> getListAmplifiers() {
        return listAmplifiers;
    }

    public List<StandardIdentityAdapter> getStandardIdentity() {
        return standardIdentity;
    }

    public List<StatusAdapter> getStatus() {
        return status;
    }

    public SymbolSetAdapter getSymbolSet(SymbolSet symbolSet) {
        return symbolSets.computeIfAbsent(symbolSet, SymbolSetAdapter::new);
    }

    public Map<SymbolSet, SymbolSetAdapter> getSymbolSets() {
        return symbolSets;
    }

    public List<VersionAdapter> getVersion() {
        return version;
    }

}
