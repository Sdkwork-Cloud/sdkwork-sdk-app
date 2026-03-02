using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class HomeDashboardVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public UserInfoVO? UserInfo { get; set; }
        public StatisticsVO? Statistics { get; set; }
        public List<ShortcutVO>? Shortcuts { get; set; }
        public List<RecentActivityVO>? RecentActivities { get; set; }
        public List<RecentProjectVO>? RecentProjects { get; set; }
        public List<TodoItemVO>? TodoItems { get; set; }
        public List<RecommendationVO>? Recommendations { get; set; }
        public List<TrendingItemVO>? TrendingItems { get; set; }
        public List<AchievementVO>? Achievements { get; set; }
        public List<PopupNotificationVO>? Notifications { get; set; }
        public List<ChartDataVO>? ChartData { get; set; }
    }
}
