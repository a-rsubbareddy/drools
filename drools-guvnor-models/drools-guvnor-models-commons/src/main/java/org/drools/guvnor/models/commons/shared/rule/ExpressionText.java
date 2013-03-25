/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.models.commons.shared.rule;

import org.drools.guvnor.models.commons.shared.oracle.DataType;

public class ExpressionText extends ExpressionPart {

    public ExpressionText() {
    }

    public ExpressionText( String name,
                           String classType,
                           String genericType ) {
        super( name, classType, genericType );
    }

    public ExpressionText( String name ) {
        super( name, "java.lang.String", DataType.TYPE_STRING );
    }

    @Override
    public void accept( ExpressionVisitor visitor ) {
        visitor.visit( this );
    }

}
