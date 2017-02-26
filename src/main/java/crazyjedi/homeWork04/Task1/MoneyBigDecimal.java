package crazyjedi.homeWork04.Task1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Vlad on 26.02.2017.
 */
public class MoneyBigDecimal {
    /**
     * Creates BigDecimal with scale 2 (d.dd) for money operations.
     * @param val
     * @return
     */
   static BigDecimal createMoneyDecimal(String val){
       BigDecimal temp = new BigDecimal(val);
       return temp.setScale(2,BigDecimal.ROUND_HALF_UP);
   }

    static BigDecimal createMoneyDecimal(int val){
        BigDecimal temp = new BigDecimal(val);
        return temp.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    static BigDecimal createMoneyDecimal(long val){
        BigDecimal temp = new BigDecimal(val);
        return temp.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    static BigDecimal createMoneyDecimal(double val){
        BigDecimal temp = new BigDecimal(val);
        return temp.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    static BigDecimal createMoneyDecimal(float val){
        BigDecimal temp = new BigDecimal(val);
        return temp.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    static BigDecimal createMoneyDecimal(BigDecimal val){
        return val.setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
