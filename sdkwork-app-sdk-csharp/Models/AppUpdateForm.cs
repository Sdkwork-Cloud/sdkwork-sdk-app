using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppUpdateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? AccessUrl { get; set; }
        public string? Version { get; set; }
        public string? IconUrl { get; set; }
        public AppConfig? Config { get; set; }
        public AppPlatforms? Platforms { get; set; }
        public AppPlatforms? InstallPlatforms { get; set; }
        public AppInstallSkill? InstallSkill { get; set; }
        public AppInstallConfig? InstallConfig { get; set; }
        public string? PackageName { get; set; }
        public string? BundleId { get; set; }
        public string? StoreUrl { get; set; }
        public string? DownloadUrl { get; set; }
    }
}
