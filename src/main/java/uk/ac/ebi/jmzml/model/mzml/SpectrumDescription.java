/*
 * Date: 22/7/2008
 * Author: rcote
 * File: uk.ac.ebi.jmzml.model.mzml.SpectrumDescription
 *
 * jmzml is Copyright 2008 The European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.06.19 at 10:48:08 AM BST
//


package uk.ac.ebi.jmzml.model.mzml;

import uk.ac.ebi.jmzml.model.mzml.params.SpectrumDescriptionCVParam;
import uk.ac.ebi.jmzml.model.mzml.params.SpectrumDescriptionUserParam;
import uk.ac.ebi.jmzml.model.mzml.utilities.ParamGroupUpdater;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Description of the parameters for the mass spectrometer for a given acquisition (or list
 * of acquisitions).
 * <p/>
 * <p/>
 * <p>Java class for SpectrumDescriptionType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SpectrumDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/schema_revision/mzML_1.0.0}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="acquisitionList" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}AcquisitionListType" minOccurs="0"/>
 *         &lt;element name="precursorList" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}PrecursorListType" minOccurs="0"/>
 *         &lt;element name="scan" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}ScanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpectrumDescriptionType", propOrder = {
        "acquisitionList",
        "precursorList",
        "scan"
        })
public class SpectrumDescription
        extends ParamGroup
        implements Serializable {

    private final static long serialVersionUID = 100L;
    protected AcquisitionList acquisitionList;
    protected PrecursorList precursorList;
    protected Scan scan;

    /**
     * Gets the value of the acquisitionList property.
     *
     * @return possible object is
     *         {@link AcquisitionList }
     */
    public AcquisitionList getAcquisitionList() {
        return acquisitionList;
    }

    /**
     * Sets the value of the acquisitionList property.
     *
     * @param value allowed object is
     *              {@link AcquisitionList }
     */
    public void setAcquisitionList(AcquisitionList value) {
        this.acquisitionList = value;
    }

    /**
     * Gets the value of the precursorList property.
     *
     * @return possible object is
     *         {@link PrecursorList }
     */
    public PrecursorList getPrecursorList() {
        return precursorList;
    }

    /**
     * Sets the value of the precursorList property.
     *
     * @param value allowed object is
     *              {@link PrecursorList }
     */
    public void setPrecursorList(PrecursorList value) {
        this.precursorList = value;
    }

    /**
     * Gets the value of the scan property.
     *
     * @return possible object is
     *         {@link Scan }
     */
    public Scan getScan() {
        return scan;
    }

    /**
     * Sets the value of the scan property.
     *
     * @param value allowed object is
     *              {@link Scan }
     */
    public void setScan(Scan value) {
        this.scan = value;
    }

    private void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        try {

            //update our paramGroup list
            ParamGroupUpdater.updateParamGroupSubclasses(this, SpectrumDescriptionCVParam.class, SpectrumDescriptionUserParam.class);

        } catch (InstantiationException e) {
            throw new RuntimeException(this.getClass().getName() + ".afterUnmarshall: " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(this.getClass().getName() + ".afterUnmarshall: " + e.getMessage());
        }
    }

}