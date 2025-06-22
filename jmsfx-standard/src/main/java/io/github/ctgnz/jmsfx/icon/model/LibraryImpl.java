package io.github.ctgnz.jmsfx.icon.model;

import com.google.common.collect.Lists;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.icon.AmplifierEnum;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import io.github.ctgnz.jmsfx.icon.ContextEnum;
import io.github.ctgnz.jmsfx.icon.DimensionEnum;
import io.github.ctgnz.jmsfx.icon.HqtfDummyEnum;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroupEnum;
import io.github.ctgnz.jmsfx.icon.StatusEnum;
import io.github.ctgnz.jmsfx.icon.VersionEnum;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LibraryImpl {
    private final ObservableList<VersionImpl> version = FXCollections.observableArrayList();
    private final ObservableList<ContextImpl> context = FXCollections.observableArrayList();
    private final ObservableList<StandardIdentityGroupAdapter> standardIdentityGroup = FXCollections.observableArrayList();
    private final ObservableList<DimensionImpl> dimension = FXCollections.observableArrayList();
    private final ObservableList<StatusImpl> status = FXCollections.observableArrayList();
    private final ObservableList<HqtfDummyImpl> hqtfDummy = FXCollections.observableArrayList();
    private final ObservableList<AmplifierImpl> amplifiers = FXCollections.observableArrayList();
    private final ObservableList<AmplifierListImpl<?>> listAmplifiers = FXCollections.observableArrayList();
    private final ObservableList<SymbolSetImpl> symbolSets = FXCollections.observableArrayList();

    public LibraryImpl() {
        this.version.setAll(Lists.transform(Lists.newArrayList(VersionEnum.values()), VersionImpl::new));
        this.context.setAll(Lists.transform(Lists.newArrayList(ContextEnum.values()), ContextImpl::new));
        this.standardIdentityGroup.setAll(Lists.transform(Lists.newArrayList(StandardIdentityGroupEnum.values()), StandardIdentityGroupAdapter::new));
        this.dimension.setAll(Lists.transform(Lists.newArrayList(DimensionEnum.values()), DimensionImpl::new));
        this.status.setAll(Lists.transform(Lists.newArrayList(StatusEnum.values()), StatusImpl::new));
        this.hqtfDummy.setAll(Lists.transform(Lists.newArrayList(HqtfDummyEnum.values()), HqtfDummyImpl::new));
        this.amplifiers.setAll(Lists.transform(Lists.newArrayList(AmplifierEnum.values()), AmplifierImpl::new));
        this.listAmplifiers.setAll(Lists.transform(Lists.newArrayList(AmplifierListEnum.values()), AmplifierListImpl::new));
        this.symbolSets.setAll(dimension.stream().flatMap(DimensionImpl::streamSymbolSets).toList());
    }

    public ObservableList<AmplifierImpl> getAmplifiers() {
        return amplifiers;
    }

    public ObservableList<ContextImpl> getContext() {
        return context;
    }

    public ObservableList<DimensionImpl> getDimension() {
        return dimension;
    }

    public ObservableList<HqtfDummyImpl> getHqtfDummy() {
        return hqtfDummy;
    }

    public ObservableList<AmplifierListImpl<?>> getListAmplifiers() {
        return listAmplifiers;
    }

    public ObservableList<StandardIdentity> getStandardIdentity() {
        return FXCollections.observableArrayList(standardIdentityGroup.stream().flatMap(StandardIdentityGroupAdapter::streamIdentities).toList());
    }

    public ObservableList<StandardIdentityGroupAdapter> getStandardIdentityGroup() {
        return standardIdentityGroup;
    }

    public ObservableList<StatusImpl> getStatus() {
        return status;
    }

    public ObservableList<SymbolSetImpl> getSymbolSets() {
        return symbolSets;
    }

    public ObservableList<VersionImpl> getVersion() {
        return version;
    }

}
