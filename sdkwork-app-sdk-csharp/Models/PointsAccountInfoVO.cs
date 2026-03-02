using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsAccountInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AccountId { get; set; }
        public string? AccountType { get; set; }
        public string? AccountTypeName { get; set; }
        public string? OwnerId { get; set; }
        public string? UserId { get; set; }
        public int? AvailablePoints { get; set; }
        public int? FrozenPoints { get; set; }
        public int? TotalPoints { get; set; }
        public int? TokenBalance { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public int? PendingPoints { get; set; }
        public int? TotalEarned { get; set; }
        public int? TotalSpent { get; set; }
        public int? Level { get; set; }
        public string? LevelName { get; set; }
        public int? Experience { get; set; }
    }
}
