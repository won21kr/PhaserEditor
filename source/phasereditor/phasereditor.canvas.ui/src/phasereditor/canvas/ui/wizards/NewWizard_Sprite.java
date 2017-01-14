// The MIT License (MIT)
//
// Copyright (c) 2015, 2017 Arian Fornaris
//
// Permission is hereby granted, free of charge, to any person obtaining a
// copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to permit
// persons to whom the Software is furnished to do so, subject to the
// following conditions: The above copyright notice and this permission
// notice shall be included in all copies or substantial portions of the
// Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
// OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
// NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
// DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
// OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
// USE OR OTHER DEALINGS IN THE SOFTWARE.
package phasereditor.canvas.ui.wizards;

import phasereditor.canvas.core.CanvasType;

/**
 * @author arian
 *
 */
public class NewWizard_Sprite extends NewWizard_Base {

	private NewPage_SpriteSettings _settingsPage;

	public NewWizard_Sprite() {
		super(CanvasType.SPRITE);
	}

	@Override
	protected boolean isCanvasFileDesired() {
		return _settingsPage.isGenerateCanvasFile();
	}

	@Override
	public void addPages() {
		super.addPages();
		_settingsPage = new NewPage_SpriteSettings();
		_settingsPage.setSettings(getModel().getSettings());
		addPage(_settingsPage);
	}

}
