package org.everit.token.api.dto;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

import java.util.Date;

/**
 * The information of the token.
 */
public final class Token {

    /**
     * The token UUID.
     */
    private final String uuid;

    /**
     * The creation date of the token.
     */
    private final Date creationDate;

    /**
     * The expiration date of the token.
     */
    private final Date expirationDate;

    /**
     * The revocation date of the token.
     */
    private final Date revocationDate;

    /**
     * The date of the token when used.
     */
    private final Date dateOfUse;

    /**
     * The simple constructor.
     * 
     * @param uuid
     *            the token UUID.
     * @param creationDate
     *            the creation date.
     * @param expirationDate
     *            the expiration date.
     * @param revocationDate
     *            the revocation date.
     * @param dateOfUse
     *            the date of used the token.
     */
    public Token(final String uuid, final Date creationDate, final Date expirationDate, final Date revocationDate,
            final Date dateOfUse) {
        this.uuid = uuid;
        if (creationDate != null) {
            this.creationDate = (Date) creationDate.clone();
        } else {
            this.creationDate = creationDate;
        }
        if (expirationDate != null) {
            this.expirationDate = (Date) expirationDate.clone();
        } else {
            this.expirationDate = expirationDate;
        }
        if (revocationDate != null) {
            this.revocationDate = (Date) revocationDate.clone();
        } else {
            this.revocationDate = revocationDate;
        }
        if (dateOfUse != null) {
            this.dateOfUse = (Date) dateOfUse.clone();
        } else {
            this.dateOfUse = dateOfUse;
        }
    }

    /**
     * Getting the creationDate member.
     * 
     * @return the creationDate member.
     */
    public Date getCreationDate() {
        if (creationDate != null) {
            return (Date) creationDate.clone();
        }
        return null;
    }

    /**
     * Getting the dateOfUse member.
     * 
     * @return the dateOfUse member.
     */
    public Date getDateOfUse() {
        if (dateOfUse != null) {
            return (Date) dateOfUse.clone();
        }
        return null;
    }

    /**
     * Getting the expirationDate member.
     * 
     * @return the expirationDate member.
     */
    public Date getExpirationDate() {
        if (expirationDate != null) {
            return (Date) expirationDate.clone();
        }
        return null;
    }

    /**
     * Getting the revocationDate member.
     * 
     * @return the revocationDate member.
     */
    public Date getRevocationDate() {
        if (revocationDate != null) {
            return (Date) revocationDate.clone();
        }
        return null;
    }

    public String getUuid() {
        return uuid;
    }

}
