package com.pb.locationintelligence.geotax.model;



import java.util.ArrayList;
import java.util.List;


public class TaxAddressRequest {

    protected Preferences preferences;
    protected List<TaxAddress> taxAddresses;


    /**
     * Gets the value of the geoTaxPreferences property.
     *
     * @return possible object is
     * {@link Preferences }
     */
    public Preferences getPreferences() {
        return this.preferences;
    }

    /**
     * Sets the value of the geoTaxPreferences property.
     *
     * @param value allowed object is
     *              {@link Preferences }
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }


    /**
     * Gets the value of the addresses property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link  }
     */
    public List<TaxAddress> getTaxAddresses() {
        if (taxAddresses == null) {
            taxAddresses = new ArrayList<TaxAddress>();
        }
        return this.taxAddresses;
    }

    public void setTaxAddresses(List<TaxAddress> taxAddresses) {
        this.taxAddresses = taxAddresses;
    }


}
