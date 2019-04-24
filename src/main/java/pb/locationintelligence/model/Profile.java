/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 6.5.0
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


/**
 * Profile
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-23T18:47:15.972+05:30")
public class Profile   {
  @SerializedName("username")
  private String username = null;

  @SerializedName("userid")
  private String userid = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("bio")
  private String bio = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("followers")
  private Integer followers = null;

  @SerializedName("following")
  private Integer following = null;

  @SerializedName("score")
  private Integer score = null;

  public Profile username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Profile userid(String userid) {
    this.userid = userid;
    return this;
  }

   /**
   * Get userid
   * @return userid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public Profile url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Profile bio(String bio) {
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

  public Profile service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public Profile followers(Integer followers) {
    this.followers = followers;
    return this;
  }

   /**
   * Get followers
   * @return followers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFollowers() {
    return followers;
  }

  public void setFollowers(Integer followers) {
    this.followers = followers;
  }

  public Profile following(Integer following) {
    this.following = following;
    return this;
  }

   /**
   * Get following
   * @return following
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFollowing() {
    return following;
  }

  public void setFollowing(Integer following) {
    this.following = following;
  }

  public Profile score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.username, profile.username) &&
        Objects.equals(this.userid, profile.userid) &&
        Objects.equals(this.url, profile.url) &&
        Objects.equals(this.bio, profile.bio) &&
        Objects.equals(this.service, profile.service) &&
        Objects.equals(this.followers, profile.followers) &&
        Objects.equals(this.following, profile.following) &&
        Objects.equals(this.score, profile.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, userid, url, bio, service, followers, following, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

