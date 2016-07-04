
/*
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.pb.locationintelligence.geocode.model;

public enum Countries {
	
	AMERICAN_SAMOA("USA"),
	ANDORRA("AND"),
	ANGOLA("AGO"),
	ARGENTINA("ARG"),
	ARUBA("ABW"),
	AUSTRALIA("AUS"),
	AUSTRIA("AUT"),
	BAHAMAS("BHS"),
	BAHRAIN("BHR"),
	BARBADOS("BRB"),
	BELGIUM("BEL"),
	BELIZE("BLZ"),
	BENIN("BEN"),
	BERMUDA("BMU"),
	BOLIVIA("BOL"),
	BOTSWANA("BWA"),
	BRAZIL("BRA"),
	BURKINA_FASO("BFA"),
	BURUNDI("BDI"),
	CAMEROON("CMR"),
	CANADA("CAN"),
	CHILE("CHL"),
	CHINA("CHN"),
	CONGO("COG"),
	DEMOCRATIC_REPUBLIC_OF_CONGO("COD"),
	COSTA_RICA("CRI"),
	CROATIA("HRV"),
	CUBA("CUB"),
	CZECH_REPUBLIC("CZE"),
	DENMARK("DNK"),
	DOMINICAN_REPUBLIC("DOM"),
	ECUADOR("ECU"),
	EGYPT("EGY"),
	EL_SALVADOR("SLV"),
	ESTONIA("EST"),
	FINLAND("FIN"),
	FRANCE("FRA"),
	FRENCH_GUYANA("GUF"),
	GABON("GAB"),
	GERMANY("DEU"),
	GHANA("GHA"),
	GREAT_BRITAIN("GBR"),
	GREECE("GRC"),
	GUADELOUPE("GLP"),
	GUAM("USA"),
	GUATEMALA("GTM"),
	GUYANA("GUY"),
	HONDURAS("HND"),
	HONG_KONG("HKG"),
	HUNGARY("HUN"),
	ICELAND("ISL"),
	INDIA("IND"),
	INDONESIA("IDN"),
	IRELAND("IRL"),
	ITALY("ITA"),
	JAMAICA("JAM"),
	JAPAN("JPN"),
	KENYA("KEN"),
	KUWAIT("KWT"),
	LATVIA("LVA"),
	LEBANON("LBN"),
	LESOTHO("LSO"),
	LIECHTENSTEIN("LIE"),
	LITHUANIA("LTU"),
	LUXEMBOURG("LUX"),
	MACAO("MAC"),
	MALAWI("MWI"),
	MALAYSIA("MYS"),
	MALI("MLI"),
	MARTINIQUE("MTQ"),
	MAURITANIA("MRT"),
	MAURITIUS("MUS"),
	MAYOTTE("MYT"),
	MEXICO("MEX"),
	MONACO("MCO"),
	MOROCCO("MAR"),
	MOZAMBIQUE("MOZ"),
	NAMIBIA("NAM"),
	NETHERLANDS("NLD"),
	NEW_ZEALAND("NZL"),
	NICARAGUA("NIC"),
	NIGER("NER"),
	NIGERIA("NGA"),
	NORTH_MARIANA_ISLANDS("USA"),
	NORWAY("NOR"),
	OMAN("OMN"),
	PALAU("USA"),
	PANAMA("PAN"),
	PARAGUAY("PRY"),
	PERU("PER"),
	PHILIPPINES("PHL"),
	POLAND("POL"),
	PORTUGAL("PRT"),
	PUERTO_RICO("USA"),
	QATAR("QAT"),
	REUNION("REU"),
	ROMANIA("ROU"),
	RUSSIAN_FEDERATION("RUS"),
	RWANDA("RWA"),
	SAINT_KITTS_AND_NEVIS("KNA"),
	SAUDI_ARABIA("SAU"),
	SENEGAL("SEN"),
	SINGAPORE("SGP"),
	SLOVAKIA("SVK"),
	SLOVENIA("SVN"),
	SOUTH_AFRICA("ZAF"),
	SPAIN("ESP"),
	SURINAME("SUR"),
	SWAZILAND("SWZ"),
	SWEDEN("SWE"),
	SWITZERLAND("CHE"),
	TAIWAN("TWN"),
	UNITED_REPUBLIC_OF_TANZANIA("TZA"),
	THAILAND("THA"),
	TOGO("TGO"),
	TRINIDAD_AND_TOBAGO("TTO"),
	TUNISIA("TUN"),
	TURKEY("TUR"),
	UGANDA("UGA"),
	UKRAINE("UKR"),
	UNITED_ARAB_EMIRATES("ARE"),
	UNITED_KINGDOM("GBR"),
	UNITED_STATES("USA"),
	URUGUAY("URY"),
	VENEZUELA("VEN"),
	VIRGIN_ISLANDS("USA"),
	WORLD_GEOCODER("XWG"),
	ZAMBIA("ZMB"),
	ZIMBABWE("ZWE");

	private final String value;

    Countries(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Countries fromValue(String v) {
        for (Countries c: Countries.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}