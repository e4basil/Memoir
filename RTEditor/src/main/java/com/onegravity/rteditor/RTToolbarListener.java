/*
 * Copyright (C) 2015-2016 Emanuel Moecklin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.onegravity.rteditor;

import com.onegravity.rteditor.effects.Effect;
import com.onegravity.rteditor.spans.RTSpan;

/*
 * Listener interface to listen to toolbar events like bold selected/unselected.
 * The methods should be fairly self-explaining.
 */
public interface RTToolbarListener {

    public <V, C extends RTSpan<V>> void onEffectSelected(Effect<V, C> effect, V value);

    public void onUndo();

    public void onRedo();

    public void onClearFormatting();

    public void onCreateLink();

    public void onPickImage();

    public void onCaptureImage();

}
