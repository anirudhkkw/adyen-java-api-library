package com.adyen.service.balanceplatform;

import java.io.IOException;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.model.balanceplatform.AccountHolder;
import com.adyen.model.balanceplatform.BalanceAccount;
import com.adyen.model.balanceplatform.Onboarding;
import com.adyen.model.legalentitymanagement.LegalEntity;
import com.adyen.model.legalentitymanagement.LegalEntityInfoRequiredType;
import com.adyen.service.exception.ApiException;
import com.adyen.service.legalentitymanagement.LegalEntitiesApi;

public class OnboardingService extends Service {

    private Client legalEntityClient;
    private Client accountHolderClient;
    private Client balanceAccountClient;
    private Onboarding onboarding;

    protected OnboardingService(Client client) {
        super(client);
        //TODO Auto-generated constructor stub
    }

    public Onboarding createOnboarding(LegalEntityInfoRequiredType legalEntityInfoRequiredType) throws ApiException, IOException{
        try {
            LegalEntity legalEntity = new LegalEntitiesApi(legalEntityClient).createLegalEntity(legalEntityInfoRequiredType);
            AccountHolder accountHolder = new AccountHoldersApi(accountHolderClient).createAccountHolder(null);
            BalanceAccount balanceAccount = new BalanceAccountsApi(balanceAccountClient).createBalanceAccount(null);
            onboarding = new Onboarding(legalEntity, accountHolder, balanceAccount);
            return onboarding;
        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw e;
        }
        
    }

}
