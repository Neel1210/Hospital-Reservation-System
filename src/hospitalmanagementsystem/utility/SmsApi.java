/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.utility;

/**
 *
 * @author spsub
 */
public interface SmsApi {
    public boolean sendMessage(String number,String message) throws Exception;
    public boolean sendOTP(String number,String message) throws Exception;
}
