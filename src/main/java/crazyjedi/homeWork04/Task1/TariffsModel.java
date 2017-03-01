package crazyjedi.homeWork04.Task1;

import crazyjedi.homeWork04.Task1.Bank.Currency;

import java.math.BigDecimal;

/**
 * Created by Vlad on 26.02.2017.
 */
public final class TariffsModel {
    /**
     * Model object for Bank. Contains required parameters (comissions, funding and withdrawal limits, etc...).
     */

    private int usdWithdrawalLimit;
    private int euroWithdrawalLimit;
    private int usdFundingLimit;
    private int euroFundingLimit;
    private int usdMonthlyRate;
    private int euroMonthlyRate;
    private int breakingPointForPrices;
    private String smallUSDComission;
    private String largeUSDComission;
    private String smallEuroComission;
    private String largeEuroComission;


    public TariffsModel(int usdWithdrawalLimit, int euroWithdrawalLimit, int usdFundingLimit, int usdMonthlyRate
                        , int euroFundingLimit, int euroMonthlyRate, int breakingPointForPrices, String smallUSDComission,
                        String largeUSDComission,String smallEuroComission,String largeEuroComission
                        ) {
        this.usdWithdrawalLimit = usdWithdrawalLimit;
        this.euroWithdrawalLimit = euroWithdrawalLimit;
        this.usdFundingLimit = usdFundingLimit;
        this.euroFundingLimit = euroFundingLimit;
        this.usdMonthlyRate = usdMonthlyRate;
        this.euroMonthlyRate = euroMonthlyRate;
        this.breakingPointForPrices = breakingPointForPrices;
        this.smallUSDComission=smallUSDComission;
        this.largeUSDComission=largeUSDComission;
        this.smallEuroComission=smallEuroComission;
        this.largeEuroComission=largeEuroComission;
        this.validateState();
    }


    public int getUsdWithdrawalLimit() {
        return usdWithdrawalLimit;
    }

    public int getEuroWithdrawalLimit() {
        return euroWithdrawalLimit;
    }

    public int getUsdFundingLimit() {
        return usdFundingLimit;
    }

    public int getEuroFundingLimit() {
        return euroFundingLimit;
    }

    public int getUsdMonthlyRate() {
        return usdMonthlyRate;
    }

    public int getEuroMonthlyRate() {
        return euroMonthlyRate;
    }

    public int getBreakingPointForPrices() {
        return breakingPointForPrices;
    }

    public String getSmallUSDComission() {
        return smallUSDComission;
    }

    public String getLargeUSDComission() {
        return largeUSDComission;
    }

    public String getSmallEuroComission() {
        return smallEuroComission;
    }

    public String getLargeEuroComission() {
        return largeEuroComission;
    }

    private void validateState(){
        /*
         * не могу удержаться) Эти ограничения диктуются здравым смыслом. Не может быть лимит снятия <0
         * , например. Это просто бессмысленно.
         */
        String message = "";
        if(usdWithdrawalLimit<0){
            message+="usdWithdrawalLimit must be >=0 !\n";
        }
        if(euroWithdrawalLimit<0){
            message+="euroWithdrawalLimit must be >=0 !\n";
        }
        if(usdFundingLimit<-1){
            message+="usdFundingLimit must be >=0 or == -1 if there is no limit !\n";
        }
        if(euroFundingLimit<-1){
            message+="euroFundingLimit must be >=0 or == -1 if there is no limit !\n";
        }
        if(usdMonthlyRate<0){
            message+="usdMonthlyRate must be >=0 !\n";
        }
        if(euroMonthlyRate<0){
            message+="euroMonthlyRate must be >=0 !\n";
        }
        if(breakingPointForPrices<0){
            message+="breakingPointForPrices must be >=0 !\n";
        }
        if("".equals(smallUSDComission)){
            message+="smallUSDComission must be filled!\n";
        }
        if("".equals(largeUSDComission)){
            message+="largeUSDComission must be filled!\n";
        }
        if("".equals(smallEuroComission)){
            message+="smallEuroComission must be filled!\n";
        }
        if("".equals(largeEuroComission)){
            message+="largeEuroComission must be filled!";
        }
        if(!"".equals(message)){
            throw new IllegalStateException(message);
        }
    }



}
