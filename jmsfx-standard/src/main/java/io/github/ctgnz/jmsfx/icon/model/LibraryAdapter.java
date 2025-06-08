package io.github.ctgnz.jmsfx.icon.model;

import com.google.common.collect.Lists;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import io.github.ctgnz.jmsfx.icon.Context;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.HqtfDummy;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.Status;
import io.github.ctgnz.jmsfx.icon.Version;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LibraryAdapter {
    private final ObservableList<VersionAdapter> version = FXCollections.observableArrayList();
    private final ObservableList<ContextAdapter> context = FXCollections.observableArrayList();
    private final ObservableList<StandardIdentityGroupAdapter> standardIdentityGroup = FXCollections.observableArrayList();
    private final ObservableList<DimensionAdapter> dimension = FXCollections.observableArrayList();
    private final ObservableList<StatusAdapter> status = FXCollections.observableArrayList();
    private final ObservableList<HqtfDummyAdapter> hqtfDummy = FXCollections.observableArrayList();
    private final ObservableList<AmplifierAdapter> amplifiers = FXCollections.observableArrayList();
    private final ObservableList<AmplifierListAdapter<?>> listAmplifiers = FXCollections.observableArrayList();
    private final ObservableList<SymbolSetAdapter> symbolSets = FXCollections.observableArrayList();

    public LibraryAdapter() {
        this.version.setAll(Lists.transform(Lists.newArrayList(Version.values()), VersionAdapter::new));
        this.context.setAll(Lists.transform(Lists.newArrayList(Context.values()), ContextAdapter::new));
        this.standardIdentityGroup.setAll(Lists.transform(Lists.newArrayList(StandardIdentityGroup.values()), StandardIdentityGroupAdapter::new));
        this.dimension.setAll(Lists.transform(Lists.newArrayList(Dimension.values()), DimensionAdapter::new));
        this.status.setAll(Lists.transform(Lists.newArrayList(Status.values()), StatusAdapter::new));
        this.hqtfDummy.setAll(Lists.transform(Lists.newArrayList(HqtfDummy.values()), HqtfDummyAdapter::new));
        this.amplifiers.setAll(Lists.transform(Lists.newArrayList(Amplifier.values()), AmplifierAdapter::new));
        this.listAmplifiers.setAll(Lists.transform(Lists.newArrayList(AmplifierList.values()), AmplifierListAdapter::new));
        this.symbolSets.setAll(dimension.stream().flatMap(DimensionAdapter::streamSymbolSets).toList());
    }

    public ObservableList<AmplifierAdapter> getAmplifiers() {
        return amplifiers;
    }

    public ObservableList<ContextAdapter> getContext() {
        return context;
    }

    public ObservableList<DimensionAdapter> getDimension() {
        return dimension;
    }

    public ObservableList<HqtfDummyAdapter> getHqtfDummy() {
        return hqtfDummy;
    }

    public ObservableList<AmplifierListAdapter<?>> getListAmplifiers() {
        return listAmplifiers;
    }

    public ObservableList<IStandardIdentity> getStandardIdentity() {
        return FXCollections.observableArrayList(standardIdentityGroup.stream().flatMap(StandardIdentityGroupAdapter::streamIdentities).toList());
    }

    public ObservableList<StandardIdentityGroupAdapter> getStandardIdentityGroup() {
        return standardIdentityGroup;
    }

    public ObservableList<StatusAdapter> getStatus() {
        return status;
    }

    public ObservableList<SymbolSetAdapter> getSymbolSets() {
        return symbolSets;
    }

    public ObservableList<VersionAdapter> getVersion() {
        return version;
    }

}
