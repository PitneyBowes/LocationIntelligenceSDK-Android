/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.0.0
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
 * IndexVariable
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-07T16:31:43.806+05:30")
public class IndexVariable   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("score")
  private String score = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("percentile")
  private String percentile = null;

  public IndexVariable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IndexVariable score(String score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public IndexVariable category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IndexVariable percentile(String percentile) {
    this.percentile = percentile;
    return this;
  }

   /**
   * Get percentile
   * @return percentile
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPercentile() {
    return percentile;
  }

  public void setPercentile(String percentile) {
    this.percentile = percentile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexVariable indexVariable = (IndexVariable) o;
    return Objects.equals(this.name, indexVariable.name) &&
        Objects.equals(this.score, indexVariable.score) &&
        Objects.equals(this.category, indexVariable.category) &&
        Objects.equals(this.percentile, indexVariable.percentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, score, category, percentile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexVariable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
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
