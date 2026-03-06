using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AppId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public ImageMediaResource? Icon { get; set; }
        public string? IconUrl { get; set; }
        public string? AccessUrl { get; set; }
        public string? Version { get; set; }
        public string? AppType { get; set; }
        public string? Status { get; set; }
        public int? ProjectId { get; set; }
        public AppInstallSkill? InstallSkill { get; set; }
    }
}
