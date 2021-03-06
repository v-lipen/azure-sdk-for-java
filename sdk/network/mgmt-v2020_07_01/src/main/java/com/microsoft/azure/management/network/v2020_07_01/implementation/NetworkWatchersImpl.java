/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.NetworkWatchers;
import com.microsoft.azure.management.network.v2020_07_01.NetworkWatcher;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_07_01.Topology;
import com.microsoft.azure.management.network.v2020_07_01.VerificationIPFlowResult;
import com.microsoft.azure.management.network.v2020_07_01.NextHopResult;
import com.microsoft.azure.management.network.v2020_07_01.SecurityGroupViewResult;
import com.microsoft.azure.management.network.v2020_07_01.TroubleshootingResult;
import com.microsoft.azure.management.network.v2020_07_01.FlowLogInformation;
import com.microsoft.azure.management.network.v2020_07_01.ConnectivityInformation;
import com.microsoft.azure.management.network.v2020_07_01.AzureReachabilityReport;
import com.microsoft.azure.management.network.v2020_07_01.AvailableProvidersList;
import com.microsoft.azure.management.network.v2020_07_01.NetworkConfigurationDiagnosticResponse;
import com.microsoft.azure.management.network.v2020_07_01.TopologyParameters;
import com.microsoft.azure.management.network.v2020_07_01.VerificationIPFlowParameters;
import com.microsoft.azure.management.network.v2020_07_01.NextHopParameters;
import com.microsoft.azure.management.network.v2020_07_01.TroubleshootingParameters;
import com.microsoft.azure.management.network.v2020_07_01.ConnectivityParameters;
import com.microsoft.azure.management.network.v2020_07_01.AzureReachabilityReportParameters;
import com.microsoft.azure.management.network.v2020_07_01.AvailableProvidersListParameters;
import com.microsoft.azure.management.network.v2020_07_01.NetworkConfigurationDiagnosticParameters;

class NetworkWatchersImpl extends GroupableResourcesCoreImpl<NetworkWatcher, NetworkWatcherImpl, NetworkWatcherInner, NetworkWatchersInner, NetworkManager>  implements NetworkWatchers {
    protected NetworkWatchersImpl(NetworkManager manager) {
        super(manager.inner().networkWatchers(), manager);
    }

    @Override
    protected Observable<NetworkWatcherInner> getInnerAsync(String resourceGroupName, String name) {
        NetworkWatchersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        NetworkWatchersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<NetworkWatcher> listByResourceGroup(String resourceGroupName) {
        NetworkWatchersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<NetworkWatcher> listByResourceGroupAsync(String resourceGroupName) {
        NetworkWatchersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<NetworkWatcherInner>, Observable<NetworkWatcherInner>>() {
            @Override
            public Observable<NetworkWatcherInner> call(Page<NetworkWatcherInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<NetworkWatcherInner, NetworkWatcher>() {
            @Override
            public NetworkWatcher call(NetworkWatcherInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<NetworkWatcher> list() {
        NetworkWatchersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<NetworkWatcher> listAsync() {
        NetworkWatchersInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<NetworkWatcherInner>, Observable<NetworkWatcherInner>>() {
            @Override
            public Observable<NetworkWatcherInner> call(Page<NetworkWatcherInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<NetworkWatcherInner, NetworkWatcher>() {
            @Override
            public NetworkWatcher call(NetworkWatcherInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public NetworkWatcherImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<Topology> getTopologyAsync(String resourceGroupName, String networkWatcherName, TopologyParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.getTopologyAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<TopologyInner, Topology>() {
            @Override
            public Topology call(TopologyInner inner) {
                return new TopologyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VerificationIPFlowResult> verifyIPFlowAsync(String resourceGroupName, String networkWatcherName, VerificationIPFlowParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.verifyIPFlowAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<VerificationIPFlowResultInner, VerificationIPFlowResult>() {
            @Override
            public VerificationIPFlowResult call(VerificationIPFlowResultInner inner) {
                return new VerificationIPFlowResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NextHopResult> getNextHopAsync(String resourceGroupName, String networkWatcherName, NextHopParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.getNextHopAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<NextHopResultInner, NextHopResult>() {
            @Override
            public NextHopResult call(NextHopResultInner inner) {
                return new NextHopResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SecurityGroupViewResult> getVMSecurityRulesAsync(String resourceGroupName, String networkWatcherName, String targetResourceId) {
        NetworkWatchersInner client = this.inner();
        return client.getVMSecurityRulesAsync(resourceGroupName, networkWatcherName, targetResourceId)
        .map(new Func1<SecurityGroupViewResultInner, SecurityGroupViewResult>() {
            @Override
            public SecurityGroupViewResult call(SecurityGroupViewResultInner inner) {
                return new SecurityGroupViewResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TroubleshootingResult> getTroubleshootingAsync(String resourceGroupName, String networkWatcherName, TroubleshootingParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.getTroubleshootingAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<TroubleshootingResultInner, TroubleshootingResult>() {
            @Override
            public TroubleshootingResult call(TroubleshootingResultInner inner) {
                return new TroubleshootingResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TroubleshootingResult> getTroubleshootingResultAsync(String resourceGroupName, String networkWatcherName, String targetResourceId) {
        NetworkWatchersInner client = this.inner();
        return client.getTroubleshootingResultAsync(resourceGroupName, networkWatcherName, targetResourceId)
        .map(new Func1<TroubleshootingResultInner, TroubleshootingResult>() {
            @Override
            public TroubleshootingResult call(TroubleshootingResultInner inner) {
                return new TroubleshootingResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<FlowLogInformation> setFlowLogConfigurationAsync(String resourceGroupName, String networkWatcherName, FlowLogInformationInner parameters) {
        NetworkWatchersInner client = this.inner();
        return client.setFlowLogConfigurationAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<FlowLogInformationInner, FlowLogInformation>() {
            @Override
            public FlowLogInformation call(FlowLogInformationInner inner) {
                return new FlowLogInformationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<FlowLogInformation> getFlowLogStatusAsync(String resourceGroupName, String networkWatcherName, String targetResourceId) {
        NetworkWatchersInner client = this.inner();
        return client.getFlowLogStatusAsync(resourceGroupName, networkWatcherName, targetResourceId)
        .map(new Func1<FlowLogInformationInner, FlowLogInformation>() {
            @Override
            public FlowLogInformation call(FlowLogInformationInner inner) {
                return new FlowLogInformationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConnectivityInformation> checkConnectivityAsync(String resourceGroupName, String networkWatcherName, ConnectivityParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.checkConnectivityAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<ConnectivityInformationInner, ConnectivityInformation>() {
            @Override
            public ConnectivityInformation call(ConnectivityInformationInner inner) {
                return new ConnectivityInformationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AzureReachabilityReport> getAzureReachabilityReportAsync(String resourceGroupName, String networkWatcherName, AzureReachabilityReportParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.getAzureReachabilityReportAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<AzureReachabilityReportInner, AzureReachabilityReport>() {
            @Override
            public AzureReachabilityReport call(AzureReachabilityReportInner inner) {
                return new AzureReachabilityReportImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AvailableProvidersList> listAvailableProvidersAsync(String resourceGroupName, String networkWatcherName, AvailableProvidersListParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.listAvailableProvidersAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<AvailableProvidersListInner, AvailableProvidersList>() {
            @Override
            public AvailableProvidersList call(AvailableProvidersListInner inner) {
                return new AvailableProvidersListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NetworkConfigurationDiagnosticResponse> getNetworkConfigurationDiagnosticAsync(String resourceGroupName, String networkWatcherName, NetworkConfigurationDiagnosticParameters parameters) {
        NetworkWatchersInner client = this.inner();
        return client.getNetworkConfigurationDiagnosticAsync(resourceGroupName, networkWatcherName, parameters)
        .map(new Func1<NetworkConfigurationDiagnosticResponseInner, NetworkConfigurationDiagnosticResponse>() {
            @Override
            public NetworkConfigurationDiagnosticResponse call(NetworkConfigurationDiagnosticResponseInner inner) {
                return new NetworkConfigurationDiagnosticResponseImpl(inner, manager());
            }
        });
    }

    @Override
    protected NetworkWatcherImpl wrapModel(NetworkWatcherInner inner) {
        return  new NetworkWatcherImpl(inner.name(), inner, manager());
    }

    @Override
    protected NetworkWatcherImpl wrapModel(String name) {
        return new NetworkWatcherImpl(name, new NetworkWatcherInner(), this.manager());
    }

}
