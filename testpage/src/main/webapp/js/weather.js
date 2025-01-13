let apiURL = 'https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?';
let apiKey = 'S3AZfm2Egyrf%2Bp1ufP5MBZEaDoowYupZS0xInJ2xpkPtDO06W7EbQcvOk0eTUmOYgxYf3K4IAOpXSU%2BcarvkfA%3D%3D';
var today = new Date();

var time =  ('0' + today.getHours()).slice(-2) + '00';
//time = '1100';
var todayFormat = today.getFullYear() + ('0' + (today.getMonth() + 1)).slice(-2) + ('0' + today.getDate()).slice(-2);

function parseXML(xmlDOM) { //나중에 양식맞춰서 수정 예정
	var i;

	var table = "";//"<tr><th> </th></tr>";
	//var row = xmlDOM.getElementsByTagName("itme");
    var category = xmlDOM.getElementsByTagName("category");
	var	obsrValue =  xmlDOM.getElementsByTagName("obsrValue");

	for (i = 0; i < category.length; i++) {
		if (category[i].childNodes[0].nodeValue == 'PTY' ) {
			if (obsrValue[i].childNodes[0].nodeValue == 0 ) {
				//table += "</br><image width='50px' height='50px' class="float-left" src='https://www.kma.go.kr/home/images/icon/NW/NB01.png'>";
				document.getElementById('wicon').innerHTML = "</br><image width='60px' height='60px' class='float-left' src='https://www.kma.go.kr/home/images/icon/NW/NB01.png'>" +
				document.getElementById('wicon').innerHTML;
			}
		} else if (category[i].childNodes[0].nodeValue == 'REH' ) {
			//table += "<td> 현재 습도 : " + obsrValue[i].childNodes[0].nodeValue + "%</td></br>";
			document.getElementById('sds').innerHTML = "<td> 현재 습도 : " + obsrValue[i].childNodes[0].nodeValue + "%</td></br>";
		} else if (category[i].childNodes[0].nodeValue == 'T1H' ) {
			//table += "<td> 현재 온도 : " + obsrValue[i].childNodes[0].nodeValue + "º</td></br>";	
			document.getElementById('ods').innerHTML = "<td> 현재 온도 : " + obsrValue[i].childNodes[0].nodeValue + "º</td></br>";		
		} else if (category[i].childNodes[0].nodeValue == 'WSD' ) {
			//table += "<td> 현재 풍속 : " + obsrValue[i].childNodes[0].nodeValue + "(m/s)</td></br>";	
			document.getElementById('fds').innerHTML = "<td> 현재 풍속 : " + obsrValue[i].childNodes[0].nodeValue + "(m/s)</td></br>";
		
		} 
		
		
		
	} // end for
	//document.getElementById('test1').innerHTML = table;
	//document.getElementById("demoXML").innerHTML = table;
}

var url = apiURL + "serviceKey=" + apiKey + "&pageNo=1&numOfRows=1000&dataType=xml&base_date=" + todayFormat + "&base_time=" + time + "&nx=55&ny=125"

window.onload = function() {
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function () {
		if (this.readyState == 4 && this.status == 200) { 
			console.log("xml",this.responseXML);
			console.log("xml",url);
			parseXML(this.responseXML);
			
		}
	};
	

	xhttp.open("GET", url, true);
	xhttp.send();

}
	


