package com.github.mortezaj8.fcmserverexample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by: Morteza
 * company: mobin
 * package: com.github.mortezaj8.fcmserver
 * project name:  example fcm-server
 * 26 March 2019
 **/


@RestController
public class SendController {


    @RequestMapping(value = {"send"})
    public String send(){

        FirebaseHandler.getInstance()
                .sendNotification(
                        "fF2PfKr_oBA:APA91bFK8btvwzZ4fAIU5ib7bP9YciQdH4XJxV9plKyNAcdem_2SrfbRvqRpTN04oE3ybHkl7FHu9ju_fLe7g4v68Hy2cGlwg-4fvXIX3d2qBp5oAR6nK3aA7HcYA_iZ_sSGtqIjNik0" ,
                        "a" ,
                        5
                );
        return "";
    }
}
