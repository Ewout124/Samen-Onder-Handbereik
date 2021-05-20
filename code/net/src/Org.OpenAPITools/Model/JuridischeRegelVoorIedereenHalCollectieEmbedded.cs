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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// JuridischeRegelVoorIedereenHalCollectieEmbedded
    /// </summary>
    [DataContract]
    public partial class JuridischeRegelVoorIedereenHalCollectieEmbedded :  IEquatable<JuridischeRegelVoorIedereenHalCollectieEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="JuridischeRegelVoorIedereenHalCollectieEmbedded" /> class.
        /// </summary>
        /// <param name="juridischeregelsvooriedereen">juridischeregelsvooriedereen.</param>
        public JuridischeRegelVoorIedereenHalCollectieEmbedded(List<JuridischeRegelVoorIedereenHal> juridischeregelsvooriedereen = default(List<JuridischeRegelVoorIedereenHal>))
        {
            this.Juridischeregelsvooriedereen = juridischeregelsvooriedereen;
        }

        /// <summary>
        /// Gets or Sets Juridischeregelsvooriedereen
        /// </summary>
        [DataMember(Name="juridischeregelsvooriedereen", EmitDefaultValue=false)]
        public List<JuridischeRegelVoorIedereenHal> Juridischeregelsvooriedereen { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JuridischeRegelVoorIedereenHalCollectieEmbedded {\n");
            sb.Append("  Juridischeregelsvooriedereen: ").Append(Juridischeregelsvooriedereen).Append("\n");
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
            return this.Equals(input as JuridischeRegelVoorIedereenHalCollectieEmbedded);
        }

        /// <summary>
        /// Returns true if JuridischeRegelVoorIedereenHalCollectieEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of JuridischeRegelVoorIedereenHalCollectieEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JuridischeRegelVoorIedereenHalCollectieEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Juridischeregelsvooriedereen == input.Juridischeregelsvooriedereen ||
                    this.Juridischeregelsvooriedereen != null &&
                    input.Juridischeregelsvooriedereen != null &&
                    this.Juridischeregelsvooriedereen.SequenceEqual(input.Juridischeregelsvooriedereen)
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
                if (this.Juridischeregelsvooriedereen != null)
                    hashCode = hashCode * 59 + this.Juridischeregelsvooriedereen.GetHashCode();
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
            yield break;
        }
    }

}
