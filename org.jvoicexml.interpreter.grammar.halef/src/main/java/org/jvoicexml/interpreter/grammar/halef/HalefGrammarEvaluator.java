/*
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2015 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package org.jvoicexml.interpreter.grammar.halef;

import java.net.URI;

import org.jvoicexml.implementation.grammar.GrammarEvaluator;
import org.jvoicexml.interpreter.datamodel.DataModel;

/**
 * An evaluator for halef grammars.
 * @author Patrick L. Lange
 * @since 0.7.8
 */
public class HalefGrammarEvaluator implements GrammarEvaluator {
    /** The name of the associated WFST file. */
    private final String resource;
    /** The URI of the associated grammar. */
    private final URI uri;
    
    /**
     * Constructs a new object.
     * @param resourceName the resource name of the associated WFST file
     * @param documentURI the URI of the associated grammar
     */
    public HalefGrammarEvaluator(final String resourceName, final URI documentURI) {
	resource = resourceName;
        uri = documentURI;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public URI getURI() {
        return uri;
    }


    /**
     * {@inheritDoc}
     */
    public String getResource() {
        return resource;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getSemanticInterpretation(final DataModel model,
            final String utterance) {
        return utterance;
    }
}
