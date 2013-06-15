XCodeBuildJob
=============

What is it
----------
Jenkins Plug-in.
XCodeでビルドする目的で、FreeStyleProject と同等のジョブを提供します。

既存かつ類似のPlug-inとして、XCode Plug-inがあります。

違いは以下のとおり。

 * XCode Plug-in
  * ビルダーを提供
  * 設定項目多い (空白でもかまわないけど)
 * XCodeBuildJob Plug-in
  * ジョブを提供
  * 設定項目少ない


How To Use
----------
 * 「新規ジョブ作成」で「XCodeBuildJob」を選択する
 * ジョブ設定の「ビルド手順の追加」で「XCodeビルダー」を選択する **(TODO)**
  * 読み込むxcodeprojファイルのパスを指定する
 * ジョブ実行時に「Target」「Configuration」「Schema」を選択できる **(TODO)**  
   選択肢は、xcodeprojファイルから読み込まれる **(TODO)**
  * 内部的には、xcodeprojファイルに対して "xcodebuild -list" を実行して、選択肢を取得する
 * ビルドスクリプト内では、以下のシェル変数を使用できる **(TODO)**
  * XCODEPROJ\_BUILD\_TARGET
  * XCODEPROJ\_BUILD\_CONFIGURATION
  * XCODEPROJ\_BUILD\_SCHEMA

ToDo
----
 * プロジェクトファイルを指定する
 * プロジェクトファイルパーサ作成
 * 選択肢をシェル変数に追加する機能
 * 選択肢のピン止め機能
 * ドキュメント、コメントの英語化
 * Builder継承クラス作成

 * 将来 Makefile 用ビルドジョブ、VisualStudio用ビルドジョブを作成するため、再利用しやすいようリファクタリングする
  * 共通部分を Library Plug-in 化する？単純に抽象クラスにして、ソース丸ごとコピーで対応する？悩み中
