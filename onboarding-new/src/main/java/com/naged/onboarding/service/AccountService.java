package com.naged.onboarding.service;

import org.springframework.stereotype.Service;

import java.util.Map;
/**
 *  need to create interface for this class
 */
@Service
public class AccountService {
// use Autowired annotation to inject the dependencies
    private final Map<String, String> smartMeterToPricePlanAccounts;

    public AccountService(Map<String, String> smartMeterToPricePlanAccounts) {
        this.smartMeterToPricePlanAccounts = smartMeterToPricePlanAccounts;
    }

    public String getPricePlanIdForSmartMeterId(String smartMeterId) {
        return smartMeterToPricePlanAccounts.get(smartMeterId);
    }
}
