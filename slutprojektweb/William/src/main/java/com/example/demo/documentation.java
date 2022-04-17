package com.example.demo;

public class documentation {

	public String showDocumentation() {

		String html = "<body><h1>Williams Api</h1><div id=\"hej\"><h2>Kalkylator</h2><p>Kan räkna på tre olika räknesätt</p><H4>• Plus</H4><H4>• Minus</H4><H4>• Gånger</H4><P>Nödvändiga Parametrar</P><H4>• nr1</H4><H4>• nr2</H4><H4>• typ</H4><p>Observera att parametern för gånger är = ganger</p><h4>Exempel URL :</h4><H4>http://localhost:8080/kalkylator?nr1=500&nr2=500&typ=ganger</H4><p>Du får tillbaka svaret i jason format</p></div><p>-----------------------------------------------------------------------------------------------------------------------------------</p><div id=\"hej2\"> <h2>Img</h2><p>Returnarar en bild slumpmässigt av två möjliga bilder</p><h4>URL :</h4><H4>http://localhost:8080/img</H4<p>Sedan returnaras en bild</p></div><p>-----------------------------------------------------------------------------------------------------------------------------------</p><div id=\"hej4\"> <h2>csv fil</h2><p>Returnarar en csv fil i jason format</p><h4>URL :</h4><H4>http://localhost:8080/showcsvfile</H4><p>Sedan returnaras csv filen</p></div><div id=\"hej3\"> <p>-----------------------------------------------------------------------------------------------------------------------------------</p><h2>Stensaxpåse</h2><p>Du får upp ett formular och du väljer mellan sten, sax eller påse, och sedan trycker du på spela</p><h4>URL :</h4><H4>http://localhost:8080/stensaxpåseform</H4><p>Exempel svar: Ditt val = sten, datorns val = påse. Datorn vann</p><h3>För att får resultat</h3><h4>URL :</h4><H4>http://localhost:8080/stensaxpåseresultat</H4><p>Du får all statistik returnerad i jason</p><p>Exempel svar: { \"games\":\"4\", \"wins\":\"2\", \"losses\":\"1\", \"ties\": \"1\"}</p></div></body>";
		return html;
	}
}
