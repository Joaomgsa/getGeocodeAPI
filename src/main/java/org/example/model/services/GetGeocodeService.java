package org.example.model.services;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
import org.example.model.entities.Endereco;

public class GetGeocodeService {

    /* public static final String apiKey ="4c8caa5760254a358c83cd5efe01daf5";

    JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);

    Endereco endereco = new Endereco();
    JOpenCageForwardRequest request = new JOpenCageForwardRequest(endereco.toString());
    JOpenCageResponse response = jOpenCageGeocoder.forward(request);

    JOpenCageLatLng firstResultLatLng = response.getFirstPosition(); // get the coordinate pair of the first result

    System.out.println(firstResultLatLng.getLat().toString() + "," + firstResultLatLng.getLng().toString());*/
}
