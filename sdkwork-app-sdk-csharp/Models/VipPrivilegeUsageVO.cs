using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipPrivilegeUsageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? SpeedUpUsed { get; set; }
        public int? SpeedUpLimit { get; set; }
        public int? PriorityQueueUsed { get; set; }
        public int? PriorityQueueLimit { get; set; }
        public int? ExclusiveModelUsed { get; set; }
        public int? ExclusiveModelLimit { get; set; }
    }
}
