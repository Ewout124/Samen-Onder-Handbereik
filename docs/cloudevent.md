---
layout: page-with-side-nav
title: Projecten - sub 1 
---

# CloudEvent Melding 

## Algemeen
Algemene informatie over CloudEvents is te vinden op [deze](https://cloudevents.io/) pagina.

## CloudEvent voor Melding 
Als er een nieuwe Melding wordt geregistreerd in de informatiehuishouding van een ketenpartner, dan wordt dit gemeld in een CloudEvent. Hieronder een voorbeeld van de invulling van zo'n CloudEvent. 

Hieronder een voorbeeld van hoe een CloudEvent eruit zou kunnen zien. 

{
 "specversion": "1.0",
  "id": "5e35e9cb-e821-43c8-ac48-e1f5a0ad0361",
  "source": "urn:nld:oin:00000001816076790000",
  "type": "melding.nieuw",
  "subject": "MELDING.Registratienummer",
  "time": "2025-03-19T11:41:12Z",
  "datacontenttype": "application/json",
  "dataschema": "n.v.t.",
  "data": {
    "postcode": "PERSOON.Postcode ",
    "burgerservicenummer": "PERSOON.Burgerservicenummer",
    "melding-inzage": "http://politie.nl/api/melding/{MELDING.Registratienummer}",
  }
}

Toelichting bij een paar van de attributen

1.	In het NL GOV profile for CloudEvents 1.0 wordt bij het attribuut source aangegeven: ‘SHOULD be a URN notation with 'nld' as namespace identifier.’ Daarom heb ik me daar maar aan gehouden. Het hierboven gebruikte OIN is het OIN van de Politie. Of dat OIN ook nog gevolgd moet worden door een nadere aanduiding (bijvoorbeeld van het systeem waarin de melding is aangemaakt) is nog onbekend. Ik heb nog geen idee wat wijsheid is in dit verband. 

2.	Het zal belangrijk worden om te bepalen welke waarden er voor het attribuut type gebruikt kunnen worden. Ik heb nu even melding.nieuw als voorbeeld genomen. Ik zou me voor kunnen stellen dat als een partij met een melding aan de slag gaat, dit wordt aangegeven met een CloudEvent waarin type de waarde melding.inbehandeling heeft. En misschien ook iets als melding.update, melding.afgesloten, etc. Ook hier: wat is wijsheid? Dat moet zich nog gaan wijzen. 

3.	Het attribuut subject kan worden gebruikt om een eerste filtering uit te voeren. Ik denk dat het Registratienummer van de MELDING daarvoor het meest geschikt is. 

4.	Of we het attribuut dataschema willen gebruiken moeten we nog bepalen. Hier zou een verwijzing kunnen komen naar een JSON Schema waarin de opbouw van het attribuut data in detail wordt beschreven. Ik heb het attribuut wel opgenomen, om duidelijk te laten zien dat hier in principe gebruik van gemaakt kan worden. 

5.	Het attribuut data heb ik vooralsnog gevuld met de Postcode en het Burgerservicenummer van PERSOON. Je kunt je afvragen of Burgerservicenummer zomaar opgenomen mag worden. Dat hangt mede af van hoe de autorisatie geregeld gaat worden. Als het zo is dat CloudEvents met type melding.nieuw alleen ontvangen kunnen worden door daarvoor aangewezen organisaties, dan kan zo’n attribuut Burgerservicenummer misschien gewoon onversleuteld worden opgenomen. 

 
Procesverloop 

Hieronder een beschrijving van het procesverloop. 

1.	Een ketenpartner maakt een nieuwe Melding aan in het eigen informatielandschap. 
2.	Dit leidt tot het genereren van een CloudEvent, die wordt verzonden naar c.q. wordt gedropt in Kafka. 
3.	Een consumer houdt binnenkomende CloudEvents in de gaten. 
4.	Als de consumer een nieuw CloudEvent voor de kiezen krijgt, dan kan de consumer aan de hand van een aantal context attributes bepalen of het CloudEvent mogelijk van belang zou kunnen zijn. (Welke attributen dat dan moeten zijn, is nog punt van discussie/onderzoek.)
5.	Als het CloudEvent door die eerste schifting heen komt, dan kan de consumer een API aanroepen van de ketenpartner die de melding heeft aangemaakt. 
6.	Door de aanroep van de API worden detailgegevens van de Melding aangeboden aan de consumer. Let wel: het gaat niet om de detailgegevens van het CloudEvent, of om wat Kafka ermee gedaan heeft. Het gaat echt om de functionele gegevens van de Melding. 



