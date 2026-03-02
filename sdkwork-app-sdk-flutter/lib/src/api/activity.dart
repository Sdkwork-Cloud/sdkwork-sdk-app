import '../http/client.dart';
import '../models.dart';

class ActivityApi {
  final HttpClient _client;
  
  ActivityApi(this._client);

  /// 参与活动
  Future<PlusApiResultActivityJoinVO?> join(String activityId, ActivityJoinForm body) async {
    final response = await _client.post(ApiPaths.appPath('/activity/${activityId}/join'), body: body, contentType: 'application/json');
    return response is PlusApiResultActivityJoinVO ? response : null;
  }

  /// 领取任务奖励
  Future<PlusApiResultTaskRewardVO?> claimTaskReward(String taskId) async {
    final response = await _client.post(ApiPaths.appPath('/activity/tasks/${taskId}/claim'));
    return response is PlusApiResultTaskRewardVO ? response : null;
  }

  /// 兑换商品
  Future<PlusApiResultPointsExchangeVO?> exchangeGoods(String goodsId, PointsExchangeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/activity/points-store/goods/${goodsId}/exchange'), body: body, contentType: 'application/json');
    return response is PlusApiResultPointsExchangeVO ? response : null;
  }

  /// 抽奖
  Future<PlusApiResultLotteryDrawVO?> drawLottery(String lotteryId) async {
    final response = await _client.post(ApiPaths.appPath('/activity/lottery/${lotteryId}/draw'));
    return response is PlusApiResultLotteryDrawVO ? response : null;
  }

  /// 领取奖品
  Future<PlusApiResultPrizeClaimVO?> claimPrize(String prizeId) async {
    final response = await _client.post(ApiPaths.appPath('/activity/lottery/prizes/${prizeId}/claim'));
    return response is PlusApiResultPrizeClaimVO ? response : null;
  }

  /// 每日签到
  Future<PlusApiResultCheckInVO?> checkIn() async {
    final response = await _client.post(ApiPaths.appPath('/activity/check-in'));
    return response is PlusApiResultCheckInVO ? response : null;
  }

  /// 补签
  Future<PlusApiResultCheckInMakeUpVO?> makeUpCheckIn(CheckInMakeUpForm body) async {
    final response = await _client.post(ApiPaths.appPath('/activity/check-in/make-up'), body: body, contentType: 'application/json');
    return response is PlusApiResultCheckInMakeUpVO ? response : null;
  }

  /// 获取活动详情
  Future<PlusApiResultActivityDetailVO?> getActivityDetail(String activityId) async {
    final response = await _client.get(ApiPaths.appPath('/activity/${activityId}'));
    return response is PlusApiResultActivityDetailVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultListTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/tasks'), params: params);
    return response is PlusApiResultListTaskVO ? response : null;
  }

  /// 获取参与记录
  Future<PlusApiResultPageActivityRecordVO?> getActivityRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/records'), params: params);
    return response is PlusApiResultPageActivityRecordVO ? response : null;
  }

  /// 获取排行榜
  Future<PlusApiResultRankingVO?> getRanking(String type, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/rankings/${type}'), params: params);
    return response is PlusApiResultRankingVO ? response : null;
  }

  /// 获取我的排名
  Future<PlusApiResultRankInfoVO?> getMyRank(String type, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/rankings/${type}/my-rank'), params: params);
    return response is PlusApiResultRankInfoVO ? response : null;
  }

  /// 获取积分商品
  Future<PlusApiResultPagePointsGoodsVO?> listPointsGoods(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/points-store/goods'), params: params);
    return response is PlusApiResultPagePointsGoodsVO ? response : null;
  }

  /// 获取商品详情
  Future<PlusApiResultPointsGoodsDetailVO?> getPointsGoodsDetail(String goodsId) async {
    final response = await _client.get(ApiPaths.appPath('/activity/points-store/goods/${goodsId}'));
    return response is PlusApiResultPointsGoodsDetailVO ? response : null;
  }

  /// 获取兑换记录
  Future<PlusApiResultPagePointsExchangeRecordVO?> getExchangeRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/points-store/exchange-records'), params: params);
    return response is PlusApiResultPagePointsExchangeRecordVO ? response : null;
  }

  /// 获取抽奖详情
  Future<PlusApiResultLotteryDetailVO?> getLotteryDetail(String lotteryId) async {
    final response = await _client.get(ApiPaths.appPath('/activity/lottery/${lotteryId}'));
    return response is PlusApiResultLotteryDetailVO ? response : null;
  }

  /// 获取中奖记录
  Future<PlusApiResultPageLotteryPrizeVO?> getMyPrizes(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/lottery/my-prizes'), params: params);
    return response is PlusApiResultPageLotteryPrizeVO ? response : null;
  }

  /// 获取抽奖列表
  Future<PlusApiResultListLotteryActivityVO?> listLotteryActivities() async {
    final response = await _client.get(ApiPaths.appPath('/activity/lottery/list'));
    return response is PlusApiResultListLotteryActivityVO ? response : null;
  }

  /// 获取活动列表
  Future<PlusApiResultPageActivityVO?> listActivities(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/list'), params: params);
    return response is PlusApiResultPageActivityVO ? response : null;
  }

  /// 获取签到状态
  Future<PlusApiResultCheckInStatusVO?> getCheckInStatus() async {
    final response = await _client.get(ApiPaths.appPath('/activity/check-in/status'));
    return response is PlusApiResultCheckInStatusVO ? response : null;
  }

  /// 获取签到记录
  Future<PlusApiResultListCheckInRecordVO?> getCheckInRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/activity/check-in/records'), params: params);
    return response is PlusApiResultListCheckInRecordVO ? response : null;
  }
}
