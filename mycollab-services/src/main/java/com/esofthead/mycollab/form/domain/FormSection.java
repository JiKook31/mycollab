/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_form_section*/
package com.esofthead.mycollab.form.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_form_section")
public class FormSection extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.id
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.name
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=100, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("name")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.layoutIndex
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("layoutIndex")
    private Integer layoutindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.module
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("module")
    private String module;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.sAccountId
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.layoutType
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("layoutType")
    private Integer layouttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.isDeleteSection
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("isDeleteSection")
    private Boolean isdeletesection;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.id
     *
     * @return the value of m_form_section.id
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.id
     *
     * @param id the value for m_form_section.id
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.name
     *
     * @return the value of m_form_section.name
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.name
     *
     * @param name the value for m_form_section.name
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.layoutIndex
     *
     * @return the value of m_form_section.layoutIndex
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public Integer getLayoutindex() {
        return layoutindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.layoutIndex
     *
     * @param layoutindex the value for m_form_section.layoutIndex
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setLayoutindex(Integer layoutindex) {
        this.layoutindex = layoutindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.module
     *
     * @return the value of m_form_section.module
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.module
     *
     * @param module the value for m_form_section.module
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.sAccountId
     *
     * @return the value of m_form_section.sAccountId
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.sAccountId
     *
     * @param saccountid the value for m_form_section.sAccountId
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.layoutType
     *
     * @return the value of m_form_section.layoutType
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public Integer getLayouttype() {
        return layouttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.layoutType
     *
     * @param layouttype the value for m_form_section.layoutType
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setLayouttype(Integer layouttype) {
        this.layouttype = layouttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.isDeleteSection
     *
     * @return the value of m_form_section.isDeleteSection
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public Boolean getIsdeletesection() {
        return isdeletesection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.isDeleteSection
     *
     * @param isdeletesection the value for m_form_section.isDeleteSection
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    public void setIsdeletesection(Boolean isdeletesection) {
        this.isdeletesection = isdeletesection;
    }

    public static enum Field {
        id,
        name,
        layoutindex,
        module,
        saccountid,
        layouttype,
        isdeletesection;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}