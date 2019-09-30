/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 7.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pb.locationintelligence.model.IdentityDetail;
import pb.locationintelligence.model.Neighborhood;
import pb.locationintelligence.model.Property;


/**
 * Identity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:11:39.640+05:30")
public class Identity   {
  @SerializedName("email")
  private String email = null;

  @SerializedName("emailHash")
  private String emailHash = null;

  @SerializedName("twitter")
  private String twitter = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("ageRange")
  private String ageRange = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("organization")
  private String organization = null;

  @SerializedName("linkedin")
  private String linkedin = null;

  @SerializedName("facebook")
  private String facebook = null;

  @SerializedName("bio")
  private String bio = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("details")
  private IdentityDetail details = null;

  @SerializedName("property")
  private Property property = null;

  @SerializedName("neighborhood")
  private Neighborhood neighborhood = null;

  public Identity email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Identity emailHash(String emailHash) {
    this.emailHash = emailHash;
    return this;
  }

   /**
   * Get emailHash
   * @return emailHash
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmailHash() {
    return emailHash;
  }

  public void setEmailHash(String emailHash) {
    this.emailHash = emailHash;
  }

  public Identity twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Identity phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Identity fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Identity ageRange(String ageRange) {
    this.ageRange = ageRange;
    return this;
  }

   /**
   * Get ageRange
   * @return ageRange
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgeRange() {
    return ageRange;
  }

  public void setAgeRange(String ageRange) {
    this.ageRange = ageRange;
  }

  public Identity gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Identity location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Identity title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Identity organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public Identity linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

   /**
   * Get linkedin
   * @return linkedin
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

  public Identity facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Get facebook
   * @return facebook
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public Identity bio(String bio) {
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public Identity avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Identity website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Identity details(IdentityDetail details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdentityDetail getDetails() {
    return details;
  }

  public void setDetails(IdentityDetail details) {
    this.details = details;
  }

  public Identity property(Property property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(example = "null", value = "")
  public Property getProperty() {
    return property;
  }

  public void setProperty(Property property) {
    this.property = property;
  }

  public Identity neighborhood(Neighborhood neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

   /**
   * Get neighborhood
   * @return neighborhood
  **/
  @ApiModelProperty(example = "null", value = "")
  public Neighborhood getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(Neighborhood neighborhood) {
    this.neighborhood = neighborhood;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.email, identity.email) &&
        Objects.equals(this.emailHash, identity.emailHash) &&
        Objects.equals(this.twitter, identity.twitter) &&
        Objects.equals(this.phone, identity.phone) &&
        Objects.equals(this.fullName, identity.fullName) &&
        Objects.equals(this.ageRange, identity.ageRange) &&
        Objects.equals(this.gender, identity.gender) &&
        Objects.equals(this.location, identity.location) &&
        Objects.equals(this.title, identity.title) &&
        Objects.equals(this.organization, identity.organization) &&
        Objects.equals(this.linkedin, identity.linkedin) &&
        Objects.equals(this.facebook, identity.facebook) &&
        Objects.equals(this.bio, identity.bio) &&
        Objects.equals(this.avatar, identity.avatar) &&
        Objects.equals(this.website, identity.website) &&
        Objects.equals(this.details, identity.details) &&
        Objects.equals(this.property, identity.property) &&
        Objects.equals(this.neighborhood, identity.neighborhood);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, emailHash, twitter, phone, fullName, ageRange, gender, location, title, organization, linkedin, facebook, bio, avatar, website, details, property, neighborhood);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailHash: ").append(toIndentedString(emailHash)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    ageRange: ").append(toIndentedString(ageRange)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

