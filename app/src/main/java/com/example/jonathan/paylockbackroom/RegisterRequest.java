package com.example.jonathan.paylockbackroom;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 4/16/2017.
 */

public class RegisterRequest extends StringRequest {
    private static String REGISTER_REQUEST_URL="http://irremediable-questi.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(int loption, String email, String password, Response.Listener<String>listener){
        super(Method.POST,REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("loption", loption + "");
        params.put("email", email);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
