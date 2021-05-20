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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.LocatieHal;

/**
 * RegeltekstEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T08:14:08.057894Z[Etc/UTC]")
public class RegeltekstEmbedded {
  public static final String SERIALIZED_NAME_LOCATIES = "locaties";
  @SerializedName(SERIALIZED_NAME_LOCATIES)
  private List<LocatieHal> locaties = null;


  public RegeltekstEmbedded locaties(List<LocatieHal> locaties) {
    
    this.locaties = locaties;
    return this;
  }

  public RegeltekstEmbedded addLocatiesItem(LocatieHal locatiesItem) {
    if (this.locaties == null) {
      this.locaties = new ArrayList<>();
    }
    this.locaties.add(locatiesItem);
    return this;
  }

   /**
   * &lt;body&gt;&lt;p&gt;Het werkingsgebied c.q. de locatie begrenst de juridische werking van de regeltekst, in juridische zin, te weten dat deze regeltekst alleen binnen dit werkingsgebied juridische werkingskracht heeft. Het werkingsgebied van de regeltekst is altijd aanwezig. Deze is dekkend voor de locaties/gebieden die in de regeltekst zijn genoemd. Deze locaties/gebieden worden genoemd in regels die gaan over een activiteit, functie, omgevingsnorm, omgevingswaarde of beperkingengebied. Het werkingsgebied van de regeltekst is maximaal het grondgebied van het bevoegde gezag zelf.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;
   * @return locaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<body><p>Het werkingsgebied c.q. de locatie begrenst de juridische werking van de regeltekst, in juridische zin, te weten dat deze regeltekst alleen binnen dit werkingsgebied juridische werkingskracht heeft. Het werkingsgebied van de regeltekst is altijd aanwezig. Deze is dekkend voor de locaties/gebieden die in de regeltekst zijn genoemd. Deze locaties/gebieden worden genoemd in regels die gaan over een activiteit, functie, omgevingsnorm, omgevingswaarde of beperkingengebied. Het werkingsgebied van de regeltekst is maximaal het grondgebied van het bevoegde gezag zelf.</p></body><body><p>Een inhoudelijke toelichting op de toepassing van het informatie-element.</p></body>")

  public List<LocatieHal> getLocaties() {
    return locaties;
  }


  public void setLocaties(List<LocatieHal> locaties) {
    this.locaties = locaties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegeltekstEmbedded regeltekstEmbedded = (RegeltekstEmbedded) o;
    return Objects.equals(this.locaties, regeltekstEmbedded.locaties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locaties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegeltekstEmbedded {\n");
    sb.append("    locaties: ").append(toIndentedString(locaties)).append("\n");
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

