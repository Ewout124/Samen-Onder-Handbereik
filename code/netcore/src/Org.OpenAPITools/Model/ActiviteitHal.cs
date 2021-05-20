/*
 * Plan SW - Toepasbare regel SW
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: robert.melskens@vng.nl
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ActiviteitHal
    /// </summary>
    [DataContract(Name = "ActiviteitHal")]
    public partial class ActiviteitHal : IEquatable<ActiviteitHal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ActiviteitHal" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ActiviteitHal() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ActiviteitHal" /> class.
        /// </summary>
        /// <param name="begindatum">begindatum.</param>
        /// <param name="bovenliggendeActiviteitIdentificatie">bovenliggendeActiviteitIdentificatie (required).</param>
        /// <param name="einddatum">einddatum.</param>
        /// <param name="gerelateerdeActiviteitIdentificaties">gerelateerdeActiviteitIdentificaties.</param>
        /// <param name="groep">groep (required).</param>
        /// <param name="identificatie">identificatie (required).</param>
        /// <param name="juridischeRegelVoorIedereenIdentificaties">juridischeRegelVoorIedereenIdentificaties (required).</param>
        /// <param name="laatsteWijzigingsdatum">&lt;body&gt;&lt;p&gt;De laatste datum waarop, binnen het pakket, wijzigingen zijn aangebracht aan de activiteit.&lt;/p&gt;&lt;/body&gt;.</param>
        /// <param name="naam">&lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt; (required).</param>
        /// <param name="links">links.</param>
        /// <param name="embedded">embedded.</param>
        public ActiviteitHal(DateTime begindatum = default(DateTime), string bovenliggendeActiviteitIdentificatie = default(string), DateTime einddatum = default(DateTime), List<string> gerelateerdeActiviteitIdentificaties = default(List<string>), Activiteitengroep groep = default(Activiteitengroep), string identificatie = default(string), List<string> juridischeRegelVoorIedereenIdentificaties = default(List<string>), DateTime laatsteWijzigingsdatum = default(DateTime), string naam = default(string), ActiviteitLinks links = default(ActiviteitLinks), ActiviteitEmbedded embedded = default(ActiviteitEmbedded))
        {
            // to ensure "bovenliggendeActiviteitIdentificatie" is required (not null)
            this.BovenliggendeActiviteitIdentificatie = bovenliggendeActiviteitIdentificatie ?? throw new ArgumentNullException("bovenliggendeActiviteitIdentificatie is a required property for ActiviteitHal and cannot be null");
            // to ensure "groep" is required (not null)
            this.Groep = groep ?? throw new ArgumentNullException("groep is a required property for ActiviteitHal and cannot be null");
            // to ensure "identificatie" is required (not null)
            this.Identificatie = identificatie ?? throw new ArgumentNullException("identificatie is a required property for ActiviteitHal and cannot be null");
            // to ensure "juridischeRegelVoorIedereenIdentificaties" is required (not null)
            this.JuridischeRegelVoorIedereenIdentificaties = juridischeRegelVoorIedereenIdentificaties ?? throw new ArgumentNullException("juridischeRegelVoorIedereenIdentificaties is a required property for ActiviteitHal and cannot be null");
            // to ensure "naam" is required (not null)
            this.Naam = naam ?? throw new ArgumentNullException("naam is a required property for ActiviteitHal and cannot be null");
            this.Begindatum = begindatum;
            this.Einddatum = einddatum;
            this.GerelateerdeActiviteitIdentificaties = gerelateerdeActiviteitIdentificaties;
            this.LaatsteWijzigingsdatum = laatsteWijzigingsdatum;
            this.Links = links;
            this.Embedded = embedded;
        }

        /// <summary>
        /// Gets or Sets Begindatum
        /// </summary>
        [DataMember(Name = "begindatum", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Begindatum { get; set; }

        /// <summary>
        /// Gets or Sets BovenliggendeActiviteitIdentificatie
        /// </summary>
        [DataMember(Name = "bovenliggendeActiviteitIdentificatie", IsRequired = true, EmitDefaultValue = false)]
        public string BovenliggendeActiviteitIdentificatie { get; set; }

        /// <summary>
        /// Gets or Sets Einddatum
        /// </summary>
        [DataMember(Name = "einddatum", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Einddatum { get; set; }

        /// <summary>
        /// Gets or Sets GerelateerdeActiviteitIdentificaties
        /// </summary>
        [DataMember(Name = "gerelateerdeActiviteitIdentificaties", EmitDefaultValue = false)]
        public List<string> GerelateerdeActiviteitIdentificaties { get; set; }

        /// <summary>
        /// Gets or Sets Groep
        /// </summary>
        [DataMember(Name = "groep", IsRequired = true, EmitDefaultValue = false)]
        public Activiteitengroep Groep { get; set; }

        /// <summary>
        /// Gets or Sets Identificatie
        /// </summary>
        [DataMember(Name = "identificatie", IsRequired = true, EmitDefaultValue = false)]
        public string Identificatie { get; set; }

        /// <summary>
        /// Gets or Sets JuridischeRegelVoorIedereenIdentificaties
        /// </summary>
        [DataMember(Name = "juridischeRegelVoorIedereenIdentificaties", IsRequired = true, EmitDefaultValue = false)]
        public List<string> JuridischeRegelVoorIedereenIdentificaties { get; set; }

        /// <summary>
        /// &lt;body&gt;&lt;p&gt;De laatste datum waarop, binnen het pakket, wijzigingen zijn aangebracht aan de activiteit.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <value>&lt;body&gt;&lt;p&gt;De laatste datum waarop, binnen het pakket, wijzigingen zijn aangebracht aan de activiteit.&lt;/p&gt;&lt;/body&gt;</value>
        [DataMember(Name = "laatsteWijzigingsdatum", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime LaatsteWijzigingsdatum { get; set; }

        /// <summary>
        /// &lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <value>&lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt;</value>
        [DataMember(Name = "naam", IsRequired = true, EmitDefaultValue = false)]
        public string Naam { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name = "_links", EmitDefaultValue = false)]
        public ActiviteitLinks Links { get; set; }

        /// <summary>
        /// Gets or Sets Embedded
        /// </summary>
        [DataMember(Name = "_embedded", EmitDefaultValue = false)]
        public ActiviteitEmbedded Embedded { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ActiviteitHal {\n");
            sb.Append("  Begindatum: ").Append(Begindatum).Append("\n");
            sb.Append("  BovenliggendeActiviteitIdentificatie: ").Append(BovenliggendeActiviteitIdentificatie).Append("\n");
            sb.Append("  Einddatum: ").Append(Einddatum).Append("\n");
            sb.Append("  GerelateerdeActiviteitIdentificaties: ").Append(GerelateerdeActiviteitIdentificaties).Append("\n");
            sb.Append("  Groep: ").Append(Groep).Append("\n");
            sb.Append("  Identificatie: ").Append(Identificatie).Append("\n");
            sb.Append("  JuridischeRegelVoorIedereenIdentificaties: ").Append(JuridischeRegelVoorIedereenIdentificaties).Append("\n");
            sb.Append("  LaatsteWijzigingsdatum: ").Append(LaatsteWijzigingsdatum).Append("\n");
            sb.Append("  Naam: ").Append(Naam).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  Embedded: ").Append(Embedded).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ActiviteitHal);
        }

        /// <summary>
        /// Returns true if ActiviteitHal instances are equal
        /// </summary>
        /// <param name="input">Instance of ActiviteitHal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ActiviteitHal input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Begindatum == input.Begindatum ||
                    (this.Begindatum != null &&
                    this.Begindatum.Equals(input.Begindatum))
                ) && 
                (
                    this.BovenliggendeActiviteitIdentificatie == input.BovenliggendeActiviteitIdentificatie ||
                    (this.BovenliggendeActiviteitIdentificatie != null &&
                    this.BovenliggendeActiviteitIdentificatie.Equals(input.BovenliggendeActiviteitIdentificatie))
                ) && 
                (
                    this.Einddatum == input.Einddatum ||
                    (this.Einddatum != null &&
                    this.Einddatum.Equals(input.Einddatum))
                ) && 
                (
                    this.GerelateerdeActiviteitIdentificaties == input.GerelateerdeActiviteitIdentificaties ||
                    this.GerelateerdeActiviteitIdentificaties != null &&
                    input.GerelateerdeActiviteitIdentificaties != null &&
                    this.GerelateerdeActiviteitIdentificaties.SequenceEqual(input.GerelateerdeActiviteitIdentificaties)
                ) && 
                (
                    this.Groep == input.Groep ||
                    (this.Groep != null &&
                    this.Groep.Equals(input.Groep))
                ) && 
                (
                    this.Identificatie == input.Identificatie ||
                    (this.Identificatie != null &&
                    this.Identificatie.Equals(input.Identificatie))
                ) && 
                (
                    this.JuridischeRegelVoorIedereenIdentificaties == input.JuridischeRegelVoorIedereenIdentificaties ||
                    this.JuridischeRegelVoorIedereenIdentificaties != null &&
                    input.JuridischeRegelVoorIedereenIdentificaties != null &&
                    this.JuridischeRegelVoorIedereenIdentificaties.SequenceEqual(input.JuridischeRegelVoorIedereenIdentificaties)
                ) && 
                (
                    this.LaatsteWijzigingsdatum == input.LaatsteWijzigingsdatum ||
                    (this.LaatsteWijzigingsdatum != null &&
                    this.LaatsteWijzigingsdatum.Equals(input.LaatsteWijzigingsdatum))
                ) && 
                (
                    this.Naam == input.Naam ||
                    (this.Naam != null &&
                    this.Naam.Equals(input.Naam))
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
                ) && 
                (
                    this.Embedded == input.Embedded ||
                    (this.Embedded != null &&
                    this.Embedded.Equals(input.Embedded))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Begindatum != null)
                    hashCode = hashCode * 59 + this.Begindatum.GetHashCode();
                if (this.BovenliggendeActiviteitIdentificatie != null)
                    hashCode = hashCode * 59 + this.BovenliggendeActiviteitIdentificatie.GetHashCode();
                if (this.Einddatum != null)
                    hashCode = hashCode * 59 + this.Einddatum.GetHashCode();
                if (this.GerelateerdeActiviteitIdentificaties != null)
                    hashCode = hashCode * 59 + this.GerelateerdeActiviteitIdentificaties.GetHashCode();
                if (this.Groep != null)
                    hashCode = hashCode * 59 + this.Groep.GetHashCode();
                if (this.Identificatie != null)
                    hashCode = hashCode * 59 + this.Identificatie.GetHashCode();
                if (this.JuridischeRegelVoorIedereenIdentificaties != null)
                    hashCode = hashCode * 59 + this.JuridischeRegelVoorIedereenIdentificaties.GetHashCode();
                if (this.LaatsteWijzigingsdatum != null)
                    hashCode = hashCode * 59 + this.LaatsteWijzigingsdatum.GetHashCode();
                if (this.Naam != null)
                    hashCode = hashCode * 59 + this.Naam.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
                if (this.Embedded != null)
                    hashCode = hashCode * 59 + this.Embedded.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // BovenliggendeActiviteitIdentificatie (string) minLength
            if(this.BovenliggendeActiviteitIdentificatie != null && this.BovenliggendeActiviteitIdentificatie.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BovenliggendeActiviteitIdentificatie, length must be greater than 1.", new [] { "BovenliggendeActiviteitIdentificatie" });
            }

            // Naam (string) minLength
            if(this.Naam != null && this.Naam.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Naam, length must be greater than 1.", new [] { "Naam" });
            }

            yield break;
        }
    }

}
