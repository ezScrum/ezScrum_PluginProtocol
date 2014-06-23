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


public interface IRole extends Serializable {
    String getRoleId();

    String getRoleName();
    
    public void setRoleName(String name);

    IActor[] getActors();

    IAccount[] getAccounts();

    IPermission[] getPermisions();

    boolean existAccount(String accountID);

    boolean existActor(IActor actor);

    boolean checkPermission(String resourceName, String operation);

    boolean checkPermission(String permissionName);

    boolean checkPermission(IPermission permission);

    void addActor(IActor actor);

    void addPermission(IPermission permission);

    void removeActor(String actorId);

    void addChildrenRole(IRole role);

    void addParentRole(IRole role);

    IRole[] getParentRoles();

    IRole[] getChildrenRoles();

    void removeParentRole(IRole role);

    void removeChildrenRole(IRole role);
    
	public void removeAllParentRoles();
	
	public void removeAllChildrenRoles();

    void removePermission(IPermission permission);

    void removePermission(String resourceName, String operation);

    void removePermission(String permissionName);
}
