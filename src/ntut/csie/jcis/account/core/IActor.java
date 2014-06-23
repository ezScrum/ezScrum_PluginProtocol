/*
 * Copyright (C) 2005 Chin-Yun Hsieh <hsieh@csie.ntut.edu.tw>
 *                    Yu Chin Cheng <yccheng@csie.ntut.edu.tw>
 *                    Chien-Tsun Chen <ctchen@ctchen.idv.tw>
 *                    Tsui-Chen She <kay_sher@hotmail.com>
 *                    Chia-Hao Wu<chwu2004@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package ntut.csie.jcis.account.core;

import java.io.Serializable;


/**
 * @author §d®a»¨
 *
 */
public interface IActor extends Serializable {
    public static final int TYPE_ACCOUNT = 0;
    public static final int TYPE_GROUP = 1;

    /**
     * @return
     */
    String getName();

    /**
     * @return
     */
    void setName(String name);

    String getID();

    /**
     * @param role
     * @return
     */
    boolean isInRole(IRole role);

    /**
    * @param permission
    * @return
    */
    boolean checkPermission(IPermission permission);

    int getType();

    IRole[] getRoles();

    void addRole(IRole role);

    void removeRole(IRole role);
}
