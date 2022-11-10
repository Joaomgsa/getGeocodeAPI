package org.example;



import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
import org.example.model.entities.ShortAddress;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Get Coordinates");
        System.out.print("How many addresses wana query? ");
        int n = sc.nextInt();
        sc.nextLine();
        List<ShortAddress> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            //156 Av Rio Branco, Centro, Rio de Janeiro, 156, Brazil

            System.out.print("Write address wich you want consult (Public Place, District, City, NumberPLace, Country)");

            String scshortaddress = sc.nextLine();

            ShortAddress shortAddress = new ShortAddress(scshortaddress);
            list.add(shortAddress);
        }

        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("4c8caa5760254a358c83cd5efe01daf5");

        System.out.println("Latitude, Longitude:");
        for (ShortAddress address : list) {
            JOpenCageForwardRequest request = new JOpenCageForwardRequest(String.valueOf(address));
            request.setLimit(1);
            request.setNoAnnotations(true);
            JOpenCageResponse response = jOpenCageGeocoder.forward(request);

            if (response != null && response.getResults() != null && !response.getResults().isEmpty()) {
                JOpenCageLatLng coordinates = response.getResults().get(0).getGeometry();
                System.out.println(coordinates.getLat().toString() + "," + coordinates.getLng().toString());
            } else {
                System.out.println("Unable to geocode input address: " + address);
            }

            try {
                Thread.sleep(1000); // free trial accounts limited to 1 request/sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }