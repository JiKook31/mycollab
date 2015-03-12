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
package com.esofthead.mycollab.module.project.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.project.domain.Risk;
import com.esofthead.mycollab.module.project.domain.RiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface RiskMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int countByExample(RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int deleteByExample(RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int insert(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int insertSelective(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    List<Risk> selectByExampleWithBLOBs(RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    List<Risk> selectByExample(RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    Risk selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int updateByExampleSelective(@Param("record") Risk record, @Param("example") RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int updateByExampleWithBLOBs(@Param("record") Risk record, @Param("example") RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int updateByExample(@Param("record") Risk record, @Param("example") RiskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int updateByPrimaryKeySelective(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int updateByPrimaryKeyWithBLOBs(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    int updateByPrimaryKey(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    Integer insertAndReturnKey(Risk value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_risk
     *
     * @mbggenerated Wed Mar 11 09:10:41 ICT 2015
     */
    void massUpdateWithSession(@Param("record") Risk record, @Param("primaryKeys") List primaryKeys);
}