/*
 * Plan SW - Toepasbare regel SW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: robert.melskens@vng.nl
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Activiteitengroep;

/**
 * &lt;body&gt;&lt;p&gt;Een activiteit is ieder menselijk handelen waarbij, of ieder menselijk nalaten waardoor een verandering of effect in de fysieke leefomgeving wordt of kan worden bewerkstelligd.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Er wordt niet een activiteit bedoeld die een initiatiefnemer voorgenomen is om uit te voeren, maar het type activiteit waarover regels opgesteld zijn. De regel geeft aan dat activiteiten van een bepaald type activiteit wel of niet zijn toegestaan zijn op deze locatie en onder welke voorwaarden.&lt;/p&gt;&lt;/body&gt;
 */
@ApiModel(description = "<body><p>Een activiteit is ieder menselijk handelen waarbij, of ieder menselijk nalaten waardoor een verandering of effect in de fysieke leefomgeving wordt of kan worden bewerkstelligd.</p></body><body><p>Er wordt niet een activiteit bedoeld die een initiatiefnemer voorgenomen is om uit te voeren, maar het type activiteit waarover regels opgesteld zijn. De regel geeft aan dat activiteiten van een bepaald type activiteit wel of niet zijn toegestaan zijn op deze locatie en onder welke voorwaarden.</p></body>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T08:14:08.057894Z[Etc/UTC]")
public class Activiteit {
  public static final String SERIALIZED_NAME_BEGINDATUM = "begindatum";
  @SerializedName(SERIALIZED_NAME_BEGINDATUM)
  private LocalDate begindatum;

  public static final String SERIALIZED_NAME_BOVENLIGGENDE_ACTIVITEIT_IDENTIFICATIE = "bovenliggendeActiviteitIdentificatie";
  @SerializedName(SERIALIZED_NAME_BOVENLIGGENDE_ACTIVITEIT_IDENTIFICATIE)
  private String bovenliggendeActiviteitIdentificatie;

  public static final String SERIALIZED_NAME_EINDDATUM = "einddatum";
  @SerializedName(SERIALIZED_NAME_EINDDATUM)
  private LocalDate einddatum;

  public static final String SERIALIZED_NAME_GERELATEERDE_ACTIVITEIT_IDENTIFICATIES = "gerelateerdeActiviteitIdentificaties";
  @SerializedName(SERIALIZED_NAME_GERELATEERDE_ACTIVITEIT_IDENTIFICATIES)
  private List<String> gerelateerdeActiviteitIdentificaties = null;

  public static final String SERIALIZED_NAME_GROEP = "groep";
  @SerializedName(SERIALIZED_NAME_GROEP)
  private Activiteitengroep groep;

  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_JURIDISCHE_REGEL_VOOR_IEDEREEN_IDENTIFICATIES = "juridischeRegelVoorIedereenIdentificaties";
  @SerializedName(SERIALIZED_NAME_JURIDISCHE_REGEL_VOOR_IEDEREEN_IDENTIFICATIES)
  private List<String> juridischeRegelVoorIedereenIdentificaties = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAATSTE_WIJZIGINGSDATUM = "laatsteWijzigingsdatum";
  @SerializedName(SERIALIZED_NAME_LAATSTE_WIJZIGINGSDATUM)
  private LocalDate laatsteWijzigingsdatum;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private String naam;


  public Activiteit begindatum(LocalDate begindatum) {
    
    this.begindatum = begindatum;
    return this;
  }

   /**
   * Get begindatum
   * @return begindatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getBegindatum() {
    return begindatum;
  }


  public void setBegindatum(LocalDate begindatum) {
    this.begindatum = begindatum;
  }


  public Activiteit bovenliggendeActiviteitIdentificatie(String bovenliggendeActiviteitIdentificatie) {
    
    this.bovenliggendeActiviteitIdentificatie = bovenliggendeActiviteitIdentificatie;
    return this;
  }

   /**
   * Get bovenliggendeActiviteitIdentificatie
   * @return bovenliggendeActiviteitIdentificatie
  **/
  @ApiModelProperty(required = true, value = "")

  public String getBovenliggendeActiviteitIdentificatie() {
    return bovenliggendeActiviteitIdentificatie;
  }


  public void setBovenliggendeActiviteitIdentificatie(String bovenliggendeActiviteitIdentificatie) {
    this.bovenliggendeActiviteitIdentificatie = bovenliggendeActiviteitIdentificatie;
  }


  public Activiteit einddatum(LocalDate einddatum) {
    
    this.einddatum = einddatum;
    return this;
  }

   /**
   * Get einddatum
   * @return einddatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEinddatum() {
    return einddatum;
  }


  public void setEinddatum(LocalDate einddatum) {
    this.einddatum = einddatum;
  }


  public Activiteit gerelateerdeActiviteitIdentificaties(List<String> gerelateerdeActiviteitIdentificaties) {
    
    this.gerelateerdeActiviteitIdentificaties = gerelateerdeActiviteitIdentificaties;
    return this;
  }

  public Activiteit addGerelateerdeActiviteitIdentificatiesItem(String gerelateerdeActiviteitIdentificatiesItem) {
    if (this.gerelateerdeActiviteitIdentificaties == null) {
      this.gerelateerdeActiviteitIdentificaties = new ArrayList<>();
    }
    this.gerelateerdeActiviteitIdentificaties.add(gerelateerdeActiviteitIdentificatiesItem);
    return this;
  }

   /**
   * Get gerelateerdeActiviteitIdentificaties
   * @return gerelateerdeActiviteitIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGerelateerdeActiviteitIdentificaties() {
    return gerelateerdeActiviteitIdentificaties;
  }


  public void setGerelateerdeActiviteitIdentificaties(List<String> gerelateerdeActiviteitIdentificaties) {
    this.gerelateerdeActiviteitIdentificaties = gerelateerdeActiviteitIdentificaties;
  }


  public Activiteit groep(Activiteitengroep groep) {
    
    this.groep = groep;
    return this;
  }

   /**
   * Get groep
   * @return groep
  **/
  @ApiModelProperty(required = true, value = "")

  public Activiteitengroep getGroep() {
    return groep;
  }


  public void setGroep(Activiteitengroep groep) {
    this.groep = groep;
  }


  public Activiteit identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Get identificatie
   * @return identificatie
  **/
  @ApiModelProperty(required = true, value = "")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public Activiteit juridischeRegelVoorIedereenIdentificaties(List<String> juridischeRegelVoorIedereenIdentificaties) {
    
    this.juridischeRegelVoorIedereenIdentificaties = juridischeRegelVoorIedereenIdentificaties;
    return this;
  }

  public Activiteit addJuridischeRegelVoorIedereenIdentificatiesItem(String juridischeRegelVoorIedereenIdentificatiesItem) {
    this.juridischeRegelVoorIedereenIdentificaties.add(juridischeRegelVoorIedereenIdentificatiesItem);
    return this;
  }

   /**
   * Get juridischeRegelVoorIedereenIdentificaties
   * @return juridischeRegelVoorIedereenIdentificaties
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getJuridischeRegelVoorIedereenIdentificaties() {
    return juridischeRegelVoorIedereenIdentificaties;
  }


  public void setJuridischeRegelVoorIedereenIdentificaties(List<String> juridischeRegelVoorIedereenIdentificaties) {
    this.juridischeRegelVoorIedereenIdentificaties = juridischeRegelVoorIedereenIdentificaties;
  }


  public Activiteit laatsteWijzigingsdatum(LocalDate laatsteWijzigingsdatum) {
    
    this.laatsteWijzigingsdatum = laatsteWijzigingsdatum;
    return this;
  }

   /**
   * &lt;body&gt;&lt;p&gt;De laatste datum waarop, binnen het pakket, wijzigingen zijn aangebracht aan de activiteit.&lt;/p&gt;&lt;/body&gt;
   * @return laatsteWijzigingsdatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<body><p>De laatste datum waarop, binnen het pakket, wijzigingen zijn aangebracht aan de activiteit.</p></body>")

  public LocalDate getLaatsteWijzigingsdatum() {
    return laatsteWijzigingsdatum;
  }


  public void setLaatsteWijzigingsdatum(LocalDate laatsteWijzigingsdatum) {
    this.laatsteWijzigingsdatum = laatsteWijzigingsdatum;
  }


  public Activiteit naam(String naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * &lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt;
   * @return naam
  **/
  @ApiModelProperty(required = true, value = "<body><p>Een (korte) omschrijving van de activiteit.</p></body>")

  public String getNaam() {
    return naam;
  }


  public void setNaam(String naam) {
    this.naam = naam;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activiteit activiteit = (Activiteit) o;
    return Objects.equals(this.begindatum, activiteit.begindatum) &&
        Objects.equals(this.bovenliggendeActiviteitIdentificatie, activiteit.bovenliggendeActiviteitIdentificatie) &&
        Objects.equals(this.einddatum, activiteit.einddatum) &&
        Objects.equals(this.gerelateerdeActiviteitIdentificaties, activiteit.gerelateerdeActiviteitIdentificaties) &&
        Objects.equals(this.groep, activiteit.groep) &&
        Objects.equals(this.identificatie, activiteit.identificatie) &&
        Objects.equals(this.juridischeRegelVoorIedereenIdentificaties, activiteit.juridischeRegelVoorIedereenIdentificaties) &&
        Objects.equals(this.laatsteWijzigingsdatum, activiteit.laatsteWijzigingsdatum) &&
        Objects.equals(this.naam, activiteit.naam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begindatum, bovenliggendeActiviteitIdentificatie, einddatum, gerelateerdeActiviteitIdentificaties, groep, identificatie, juridischeRegelVoorIedereenIdentificaties, laatsteWijzigingsdatum, naam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activiteit {\n");
    sb.append("    begindatum: ").append(toIndentedString(begindatum)).append("\n");
    sb.append("    bovenliggendeActiviteitIdentificatie: ").append(toIndentedString(bovenliggendeActiviteitIdentificatie)).append("\n");
    sb.append("    einddatum: ").append(toIndentedString(einddatum)).append("\n");
    sb.append("    gerelateerdeActiviteitIdentificaties: ").append(toIndentedString(gerelateerdeActiviteitIdentificaties)).append("\n");
    sb.append("    groep: ").append(toIndentedString(groep)).append("\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    juridischeRegelVoorIedereenIdentificaties: ").append(toIndentedString(juridischeRegelVoorIedereenIdentificaties)).append("\n");
    sb.append("    laatsteWijzigingsdatum: ").append(toIndentedString(laatsteWijzigingsdatum)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

