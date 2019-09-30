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


/**
 * SchoolRanking
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:11:39.640+05:30")
public class SchoolRanking   {
  @SerializedName("current")
  private String current = null;

  @SerializedName("rankYear")
  private String rankYear = null;

  @SerializedName("stateRank")
  private String stateRank = null;

  @SerializedName("numberOfSchools")
  private String numberOfSchools = null;

  @SerializedName("avgMathScore")
  private String avgMathScore = null;

  @SerializedName("avgReadingScore")
  private String avgReadingScore = null;

  @SerializedName("statePercentileScore")
  private String statePercentileScore = null;

  public SchoolRanking current(String current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrent() {
    return current;
  }

  public void setCurrent(String current) {
    this.current = current;
  }

  public SchoolRanking rankYear(String rankYear) {
    this.rankYear = rankYear;
    return this;
  }

   /**
   * Get rankYear
   * @return rankYear
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRankYear() {
    return rankYear;
  }

  public void setRankYear(String rankYear) {
    this.rankYear = rankYear;
  }

  public SchoolRanking stateRank(String stateRank) {
    this.stateRank = stateRank;
    return this;
  }

   /**
   * Get stateRank
   * @return stateRank
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStateRank() {
    return stateRank;
  }

  public void setStateRank(String stateRank) {
    this.stateRank = stateRank;
  }

  public SchoolRanking numberOfSchools(String numberOfSchools) {
    this.numberOfSchools = numberOfSchools;
    return this;
  }

   /**
   * Get numberOfSchools
   * @return numberOfSchools
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumberOfSchools() {
    return numberOfSchools;
  }

  public void setNumberOfSchools(String numberOfSchools) {
    this.numberOfSchools = numberOfSchools;
  }

  public SchoolRanking avgMathScore(String avgMathScore) {
    this.avgMathScore = avgMathScore;
    return this;
  }

   /**
   * Get avgMathScore
   * @return avgMathScore
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvgMathScore() {
    return avgMathScore;
  }

  public void setAvgMathScore(String avgMathScore) {
    this.avgMathScore = avgMathScore;
  }

  public SchoolRanking avgReadingScore(String avgReadingScore) {
    this.avgReadingScore = avgReadingScore;
    return this;
  }

   /**
   * Get avgReadingScore
   * @return avgReadingScore
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvgReadingScore() {
    return avgReadingScore;
  }

  public void setAvgReadingScore(String avgReadingScore) {
    this.avgReadingScore = avgReadingScore;
  }

  public SchoolRanking statePercentileScore(String statePercentileScore) {
    this.statePercentileScore = statePercentileScore;
    return this;
  }

   /**
   * Get statePercentileScore
   * @return statePercentileScore
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatePercentileScore() {
    return statePercentileScore;
  }

  public void setStatePercentileScore(String statePercentileScore) {
    this.statePercentileScore = statePercentileScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolRanking schoolRanking = (SchoolRanking) o;
    return Objects.equals(this.current, schoolRanking.current) &&
        Objects.equals(this.rankYear, schoolRanking.rankYear) &&
        Objects.equals(this.stateRank, schoolRanking.stateRank) &&
        Objects.equals(this.numberOfSchools, schoolRanking.numberOfSchools) &&
        Objects.equals(this.avgMathScore, schoolRanking.avgMathScore) &&
        Objects.equals(this.avgReadingScore, schoolRanking.avgReadingScore) &&
        Objects.equals(this.statePercentileScore, schoolRanking.statePercentileScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, rankYear, stateRank, numberOfSchools, avgMathScore, avgReadingScore, statePercentileScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolRanking {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    rankYear: ").append(toIndentedString(rankYear)).append("\n");
    sb.append("    stateRank: ").append(toIndentedString(stateRank)).append("\n");
    sb.append("    numberOfSchools: ").append(toIndentedString(numberOfSchools)).append("\n");
    sb.append("    avgMathScore: ").append(toIndentedString(avgMathScore)).append("\n");
    sb.append("    avgReadingScore: ").append(toIndentedString(avgReadingScore)).append("\n");
    sb.append("    statePercentileScore: ").append(toIndentedString(statePercentileScore)).append("\n");
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

