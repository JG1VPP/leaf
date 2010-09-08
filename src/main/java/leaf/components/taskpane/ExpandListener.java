/**************************************************************************************
月白プロジェクト Java 拡張ライブラリ 開発コードネーム「Leaf」
始動：2010年6月8日
バージョン：Edition 1.0
開発言語：Pure Java SE 6
開発者：東大アマチュア無線クラブ2010年度新入生 川勝孝也
***************************************************************************************
「Leaf」は「月白エディタ」1.2以降及び「Jazlog(ZLOG3.0)」用に開発されたライブラリです
**************************************************************************************/
package leaf.components.taskpane;

/**
*LeafExpandPaneの展開/折りたたみのイベントを受信するリスナーです。
*@author 東大アマチュア無線クラブ
*@since Leaf 1.0 作成：2010年7月10日
*@see LeafTaskPane
*@see LeafExpandPane
*/
public interface ExpandListener{
	/**
	*展開状態の変更時に呼び出されます。
	*@param e 変更内容を表すExpandEvent
	*/
	public void stateChanged(ExpandEvent e);
}