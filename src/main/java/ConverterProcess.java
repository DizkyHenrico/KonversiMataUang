/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConverterProcess {
    public Double Dollar(Double Rupiah){
        Double totDollar = Rupiah / 14323.1;
        
        return totDollar;
    }
    public Double Euro(Double Rupiah){
        Double totEuro = Rupiah / 16185.6;
        
        return totEuro;
    }
    public Double Yen(Double Rupiah){
        Double totYen = Rupiah / 123.74;
        
        return totYen;
    
    }
    public Double Ringgit(Double Rupiah){
        Double totRinggit = Rupiah / 3421.26;
        
        return totRinggit;
    }
}
