package org.wso2telco.analytics.pricing.service;

import org.wso2telco.analytics.pricing.service.dao.RateCardDAO;

public class RateCardService {

    public Object getNBRateCard(String operationId, String applicationId, String api,String category, String subCategory) throws Exception {
        RateCardDAO rateCardDAO = new RateCardDAOImpl();
        ChargeRate chargeRate = (ChargeRate) rateCardDAO.getNBRateCard(operationId, applicationId, api, category, subCategory);

        return chargeRate;
    }

    public Object getSBRateCard(String operator, String operation, String applicationId, String category, String subCategory) throws Exception {
        RateCardDAO rateCardDAO = new RateCardDAOImpl();
        ChargeRate chargeRate = (ChargeRate) rateCardDAO.getSBRateCard(operator, operation, applicationId, category, subCategory);

        return chargeRate;
    }

    public double getValidTaxRate(String taxCode, String taxDate) throws Exception {
        RateCardDAO rateCardDAO = new RateCardDAOImpl();
        double validTaxVal = rateCardDAO.getValidTaxRate(taxCode, taxDate);

        return validTaxVal;
    }
}
