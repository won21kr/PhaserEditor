package phasereditor.canvas.ui.handlers;

import phasereditor.assetpack.core.IAssetFrameModel;
import phasereditor.canvas.core.BaseObjectModel;
import phasereditor.canvas.core.ButtonSpriteModel;
import phasereditor.canvas.core.CanvasType;
import phasereditor.canvas.core.EditorSettings;
import phasereditor.canvas.ui.editors.ObjectCanvas;
import phasereditor.canvas.ui.shapes.GroupNode;
import phasereditor.canvas.ui.shapes.ISpriteNode;

public class MorphToButtonSpriteHandler extends AbstractMorphHandler {

	@Override
	protected BaseObjectModel createMorphModel(ISpriteNode srcNode, Object source, GroupNode parent) {
		ButtonSpriteModel dstModel = new ButtonSpriteModel(parent.getModel(), (IAssetFrameModel) source);
		dstModel.updateWith(srcNode.getModel());
		
		ObjectCanvas canvas = srcNode.getControl().getCanvas();
		if (canvas.getEditor().getModel().getType() == CanvasType.SPRITE) {
			EditorSettings settings = canvas.getSettingsModel();
			settings.setBaseClass("Phaser.Button");
		}
		
		
		return dstModel;
	}
}
