package com.example.test1.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WeatherImpl {

	public static void getWeather(){
		String skey = "S3AZfm2Egyrf%2Bp1ufP5MBZEaDoowYupZS0xInJ2xpkPtDO06W7EbQcvOk0eTUmOYgxYf3K4IAOpXSU%2BcarvkfA%3D%3D";
		
		Date nowDt = new Date();
		
		SimpleDateFormat str = new SimpleDateFormat("yyyyMMdd");
		String today = str.format(nowDt);
		SimpleDateFormat str1 =  new SimpleDateFormat("HHmm");
		String time = str1.format(nowDt);

		try {	
		StringBuilder urlBuilder = new StringBuilder("https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst");
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "="+skey); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(today, "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("1100", "UTF-8")); /*02시 발표(정시단위) */
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("125", "UTF-8")); /*예보지점의 Y 좌표값*/
        URL url = (new URI(urlBuilder.toString())).toURL();
        //new URL.(urlBuilder.toString());
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        
        //System.out.println("Response code: " + conn.getResponseCode());
        
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        String sb = "";
        String line;
        while ((line = rd.readLine()) != null) {
            sb += line;
        }
        
        //System.out.println(sb);
        		
        JSONParser jsonParse = new JSONParser();
        JSONObject jsonObj = null;
        jsonObj = (JSONObject)jsonParse.parse(sb.toString());
        
        JSONParser jsonParser = new JSONParser();
        JSONObject R1Object = (JSONObject)jsonParser.parse(sb);
        JSONObject response = (JSONObject) R1Object.get("response");
        JSONObject body = (JSONObject) response.get("body");
        JSONObject items = (JSONObject) body.get("items");
        JSONArray R1Array = (JSONArray) items.get("item");
        
        //HashMap<String,Object> jsonMap = new HashMap<>();
    	HashMap<String, Object> jsonMap = new HashMap<String, Object>();
    	ArrayList<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();

        for(int i=0; i<R1Array.size(); i++) {
            jsonMap = new HashMap<String, Object>();
            JSONObject jsonObject = (JSONObject) R1Array.get(i);
            
            String category = (String) jsonObject.get("category");
            String obsrValue = (String) jsonObject.get("obsrValue");
            
            jsonMap.put("category", category);
            jsonMap.put("obsrValue", obsrValue);
            
            resultList.add(jsonMap);
            
            
        }
        
        System.out.println(resultList);
        		
        rd.close();
        conn.disconnect();
		} catch (Exception e) {
	        System.out.print(e.getMessage());

			// TODO: handle exception
		}
	}
	
}
