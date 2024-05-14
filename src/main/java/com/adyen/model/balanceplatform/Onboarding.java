package com.adyen.model.balanceplatform;

import com.adyen.model.legalentitymanagement.LegalEntity;

public class Onboarding {
    private AccountHolder accountHolder;
    private LegalEntity legalEntity;
    private BalanceAccount balanceAccount;

    public Onboarding(){

    }

    public Onboarding(LegalEntity legalEntity, AccountHolder accountHolder, BalanceAccount balanceAccount){
        this.legalEntity = legalEntity;
        this.accountHolder = accountHolder;
        this.balanceAccount = balanceAccount;
    }

}
