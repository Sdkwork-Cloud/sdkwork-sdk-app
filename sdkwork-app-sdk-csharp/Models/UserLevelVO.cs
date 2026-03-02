using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserLevelVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Icon { get; set; }
        public string? Description { get; set; }
        public int? Level { get; set; }
        public int? CurrentExp { get; set; }
        public int? RequiredExp { get; set; }
        public double? ExpProgress { get; set; }
        public List<PrivilegeVO>? Privileges { get; set; }
        public string? ValidUntil { get; set; }
        public string? Status { get; set; }
    }
}
