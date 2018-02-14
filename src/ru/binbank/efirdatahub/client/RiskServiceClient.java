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
    public TableResponse LiquidityParams(LiquidityParamsRequest liquidityParamsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Risk/LiquidityParams", "GET", liquidityParamsRequest, TableResponse.class);
    }
    public TableResponse MarketRiskData(MarketRiskDataRequest marketRiskDataRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Risk/MarketRiskData", "POST", marketRiskDataRequest, TableResponse.class);
    }
    public NominalCurrencyResponse NominalCurrency(NominalCurrencyRequest nominalCurrencyRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (NominalCurrencyResponse) runMethod("Risk/NominalCurrency", "GET", nominalCurrencyRequest, NominalCurrencyResponse.class);
    }
    public OptionParamsResponse OptionParams(OptionParamsRequest optionParamsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (OptionParamsResponse) runMethod("Risk/OptionParams", "GET", optionParamsRequest, OptionParamsResponse.class);
    }
    public TableResponse OptionValues(OptionValuesRequest optionValuesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Risk/OptionValues", "GET", optionValuesRequest, TableResponse.class);
    }
    public PfiParamsResponse PfiParams(PfiParamsRequest pfiParamsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (PfiParamsResponse) runMethod("Risk/PfiParams", "GET", pfiParamsRequest, PfiParamsResponse.class);
    }
    public RepoDiscount139Response RepoDiscount139(RepoDiscount139Request repoDiscount139Request) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (RepoDiscount139Response) runMethod("Risk/RepoDiscount139", "GET", repoDiscount139Request, RepoDiscount139Response.class);
    }
    public RiskDateResponse RiskDate(RiskDateRequest riskDateRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (RiskDateResponse) runMethod("Risk/RiskDate", "GET", riskDateRequest, RiskDateResponse.class);
    }
    public RiskGroupParamResponse RiskGroupParam(RiskGroupParamRequest riskGroupParamRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (RiskGroupParamResponse) runMethod("Risk/RiskGroupParam", "GET", riskGroupParamRequest, RiskGroupParamResponse.class);
    }
    public RiskGroupResponse RiskGroup(RiskGroupRequest riskGroupRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (RiskGroupResponse) runMethod("Risk/RiskGroup", "GET", riskGroupRequest, RiskGroupResponse.class);
    }
    public RiskGroupRuleResponse RiskGroupRule(RiskGroupRuleRequest riskGroupRuleRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (RiskGroupRuleResponse) runMethod("Risk/RiskGroupRule", "GET", riskGroupRuleRequest, RiskGroupRuleResponse.class);
    }
    public Rule421Response Rule421(Rule421Request rule421Request) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (Rule421Response) runMethod("Risk/Rule421", "GET", rule421Request, Rule421Response.class);
    }
}
