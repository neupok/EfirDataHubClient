package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.riskservice.contracts.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class RiskServiceClient extends DataHubClient {
    public RiskServiceClient(ClientConnectionSettings connectionSettings) { super(connectionSettings); }

    public TableResponse Amortizations(AmortizationsRequest amortizationsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Risk/Amortizations", "GET", amortizationsRequest, TableResponse.class);
    }
    public CouponYieldResponse CouponYield(CouponYieldRequest couponYieldRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (CouponYieldResponse) runMethod("Risk/CouponYield", "GET", couponYieldRequest, CouponYieldResponse.class);
    }
    public EquityRiskRateResponse EquityRiskRate(EquityRiskRateRequest equityRiskRateRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (EquityRiskRateResponse) runMethod("Risk/EquityRiskRate", "GET", equityRiskRateRequest, EquityRiskRateResponse.class);
    }
    public FairValueResponse FairValue(FairValueRequest fairValueRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (FairValueResponse) runMethod("Risk/FairValue", "GET", fairValueRequest, FairValueResponse.class);
    }
    public InstrumentHasRiskResponse InstrumentHasRisk(InstrumentHasRiskRequest instrumentHasRiskRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (InstrumentHasRiskResponse) runMethod("Risk/InstrumentHasRisk", "GET", instrumentHasRiskRequest, InstrumentHasRiskResponse.class);
    }
}
